package com.ace.hotel.dao.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.ace.hotel.model.Hotel;

/**
 * @author author
 */
public interface HotelBaseMapper {

    int insertHotel(Hotel object);

    int updateHotel(Hotel object);

    int update(Hotel.UpdateBuilder object);

    List<Hotel> queryHotel(Hotel object);

    Hotel queryHotelLimit1(Hotel object);

}