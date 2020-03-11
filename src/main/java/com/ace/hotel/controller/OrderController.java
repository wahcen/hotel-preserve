package com.ace.hotel.controller;

import com.ace.hotel.model.Order;
import com.ace.hotel.model.ResponseVessel;
import com.ace.hotel.service.OrderService;
import com.ace.hotel.util.MsgUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.rmi.registry.LocateRegistry;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.controller
 * @date 2019/11/4 20:07
 */
@Controller("oderController")
@RequestMapping("/order")
public class OrderController {
    private OrderService orderService;

    @Autowired
    public void setOrderService(OrderService orderService) {
        System.out.println("[DEPENDENCY INJECTION] : " + orderService.getClass().getSimpleName() + " [INTO] " + this.getClass().getSimpleName());
        this.orderService = orderService;
    }

    /**
     * 用于响应ajax异步请求，检查选定时间段内，某房间是否已被预订
     * @param checkInTime
     * @param checkOutTime
     * @return
     */
    @RequestMapping("/checkOrderTime")
    @ResponseBody
    public ResponseVessel<Void> checkOrderTime(Integer hid, String roomType, LocalDateTime checkInTime, LocalDateTime checkOutTime){
        ResponseVessel<Void> rv = new ResponseVessel<>();
        Integer state = orderService.checkOrderTime(hid, roomType, checkInTime, checkOutTime);
        if(state == 0){
            rv = new ResponseVessel<>(MsgUtil.SUCCESS, "该时间段可以预订");
        }else{
            rv = new ResponseVessel<>(MsgUtil.FAIL, "该时间段已被预订");
        }
        return rv;
    }

    @RequestMapping("/addOrder")
    @ResponseBody
    public ResponseVessel<Void> addOrder(Order order){
        ResponseVessel<Void> rv = new ResponseVessel<>();
        Integer state = orderService.addOrder(order);
        if(state == 0){
            rv = new ResponseVessel<>(MsgUtil.SUCCESS, "订单成功提交");
        }else {
            rv = new ResponseVessel<>(MsgUtil.FAIL, "该时间段已被预订");
        }
        return rv;
    }

    @RequestMapping("/cancelOrder")
    @ResponseBody
    public ResponseVessel<Void> cancelOrder(String phone, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime createdTime){
        ResponseVessel<Void> rv = new ResponseVessel<>();
        Order order = orderService.getOrder(phone, createdTime);
        System.out.println("[QUERIED ORDER] : " + order);
        Integer state_code = -2;
        if (order != null){
            state_code = orderService.cancelOrder(order);
        }
        if(state_code == 0){
            rv = new ResponseVessel<>(MsgUtil.FAIL, "取消失败，在限定时间内您未取消订单");
        }else if(state_code == -1 || state_code == 1){
            rv = new ResponseVessel<>(MsgUtil.SUCCESS, "取消成功");
            System.out.println("[SUCCESS UPDATE] : " + order);
        } else {
            rv = new ResponseVessel<>(MsgUtil.FAIL, "未知错误");
        }
        return rv;
    }
}
