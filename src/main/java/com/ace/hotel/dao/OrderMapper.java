package com.ace.hotel.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.ace.hotel.model.Order;
import com.ace.hotel.dao.base.OrderBaseMapper;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author author
 */
public interface OrderMapper extends OrderBaseMapper {
    List<Order> getOrdersByPhone(String phone);
    Integer updateOrderComment(@Param("phone") String phone, @Param("createdTime") String createdTime, @Param("comment") String comment);
    Order getOrder(@Param("phone") String phone, @Param("createdTime") String createdTime);
    Integer checkOrderTime(@Param("hid")Integer hid, @Param("roomType") String roomType, @Param("checkInTime") String checkInTime, @Param("checkOutTime") String checkOutTime);
}