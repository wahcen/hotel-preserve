package com.ace.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.ace.hotel.model.Hotel;
import com.ace.hotel.dao.base.HotelBaseMapper;

/**
 * @author author
 */
public interface HotelMapper extends HotelBaseMapper {

    public List<Hotel> getHotel(Hotel hotel);

    /**
     * 返回全部酒店
     *
     * @return
     */
    public List<Hotel> getAllHotel();

    /**
     * 根据主键hid返回酒店的详细信息
     *
     * @param hid
     * @return
     */
    public Hotel getHotelById(Integer hid);

    /**
     * 根据地址查询酒店
     */
    public List<Hotel> getHotelsByAddress(String address);
}