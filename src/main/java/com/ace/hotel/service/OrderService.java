package com.ace.hotel.service;

import com.ace.hotel.model.Order;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.service
 * @date 2019/11/2 2:06
 */
public interface OrderService {
    public List<Order> getOrders(Order order);

    public List<Order> getOrdersByPhone(String phone);

    public Order getOrder(String phone, LocalDateTime createdTime);

    public Integer checkOrderTime(Integer hid, String roomType, LocalDateTime checkInTime, LocalDateTime checkOutTime);

    public Integer addOrder(Order order);

    public Integer cancelOrder(Order order);

    public Integer deleteOrder(String phone, LocalDateTime createdTime);
}
