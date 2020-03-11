package com.ace.hotel.service.impl;

import com.ace.hotel.dao.OrderMapper;
import com.ace.hotel.dao.RoomMapper;
import com.ace.hotel.model.Order;
import com.ace.hotel.model.Room;
import com.ace.hotel.service.OrderService;
import com.ace.hotel.util.MsgUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * todo 订单服务
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.service.impl
 * @date 2019/11/4 20:18
 */
@Component("orderService")
public class OrderServiceImpl implements OrderService {
    private OrderMapper orderMapper;
    private RoomMapper roomMapper;

    @Autowired
    public void setRoomMapper(RoomMapper roomMapper) {
        System.out.println("[DEPENDENCY INJECTION] : " + roomMapper.getClass().getSimpleName() + " [INTO] " + this.getClass().getSimpleName());
        this.roomMapper = roomMapper;
    }

    @Autowired
    public void setOrderMapper(OrderMapper orderMapper) {
        System.out.println("[DEPENDENCY INJECTION] : " + orderMapper.getClass().getSimpleName() + " [INTO] " + this.getClass().getSimpleName());
        this.orderMapper = orderMapper;
    }

    @Override
    public List<Order> getOrders(Order order) {
        return orderMapper.queryOrder(order);
    }

    @Override
    public List<Order> getOrdersByPhone(String phone) {
        return orderMapper.getOrdersByPhone(phone);
    }

    @Override
    public Order getOrder(String phone, LocalDateTime createdTime) {
        System.out.println(createdTime);
        return orderMapper.getOrder(phone, createdTime.toString());
    }

    @Override
    public Integer checkOrderTime(Integer hid, String roomType, LocalDateTime checkInTime, LocalDateTime checkOutTime) {
        return orderMapper.checkOrderTime(hid, roomType, checkInTime.toString(), checkOutTime.toString());
    }

    @Override
    public Integer addOrder(Order order) {
        //state 即查询到的订单数量，state=0 即表示没有订单是和当前订单时间重合的
        Integer state = 1;
        order.setCreatedTime(LocalDateTime.now());
        System.out.println("[TRY ORDER] : " + order);
        if(order.getCheckInTime() != null && order.getCheckOutTime() != null){
            state = orderMapper.checkOrderTime(order.getHid(), order.getRoomType(), order.getCheckInTime().toString(), order.getCheckOutTime().toString());
            System.out.println("[ORDERED TIMEZONE] : " + state);
            if(state == 0){
                Room room = roomMapper.getRoom(order.getHid(), order.getRoomType());
                long days = (order.getCheckOutTime().toEpochDay() - order.getCheckInTime().toEpochDay());
                order.setTotalCharge(days * room.getCharge());
                orderMapper.insertOrder(order);
            }
        }
        return state;
    }

    @Override
    public Integer cancelOrder(Order order) {
        // policy = 0 表示不可以取消，-1表示可以随时取消
        Room room = roomMapper.getRoom(order.getHid(), order.getRoomType());
        System.out.println("[QUERIED ROOM] : " + room);
        if(room.getPolicy() == 0){
            return 0;
        }else if(room.getPolicy() == -1){
            System.out.println("[CHANGED ORDER] : " + order);
            if(order.getCheckInTime().isAfter(LocalDate.now())){
                orderMapper.updateOrderComment(order.getPhone(), order.getCreatedTime().toString(), MsgUtil.CANCELED);
                return -1;
            }
            return 0;
        }else{
            Duration duration = Duration.between(order.getCreatedTime(), LocalDateTime.now());
            if(duration.toMinutes() > room.getPolicy()){
                return 0;
            }else {
                orderMapper.updateOrderComment(order.getPhone(), order.getCreatedTime().toString(), MsgUtil.CANCELED);
            }
        }
        return 1;
    }

    @Override
    public Integer deleteOrder(String phone, LocalDateTime createdTime) {
        return null;
    }
}
