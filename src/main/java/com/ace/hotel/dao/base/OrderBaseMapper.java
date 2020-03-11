package com.ace.hotel.dao.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.ace.hotel.model.Order;

/**
 * @author author
 */
public interface OrderBaseMapper {

    int insertOrder(Order object);

    int updateOrder(Order object);

    int update(Order.UpdateBuilder object);

    List<Order> queryOrder(Order object);

    Order queryOrderLimit1(Order object);

}