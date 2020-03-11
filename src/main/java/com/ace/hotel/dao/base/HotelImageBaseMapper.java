package com.ace.hotel.dao.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.ace.hotel.model.HotelImage;

/**
 * @author author
 */
public interface HotelImageBaseMapper {

    int insertHotelImage(HotelImage object);

    int updateHotelImage(HotelImage object);

    int update(HotelImage.UpdateBuilder object);

    List<HotelImage> queryHotelImage(HotelImage object);

    HotelImage queryHotelImageLimit1(HotelImage object);

}