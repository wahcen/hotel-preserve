package com.ace.hotel.service.impl;

import com.ace.hotel.dao.HotelMapper;
import com.ace.hotel.model.Hotel;
import com.ace.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.service.impl
 * @date 2019/11/3 15:14
 */
@Component("hotelService")
public class HotelServiceImpl implements HotelService {
    private HotelMapper hotelMapper;

    @Autowired
    public void setHotelMapper(HotelMapper hotelMapper) {
        System.out.println("[DEPENDENCY INJECTION] : " + hotelMapper.getClass() + " [IN] " + this.getClass().getSimpleName());
        this.hotelMapper = hotelMapper;
    }

    @Override
    public List<Hotel> getHotels(Hotel hotel) {
        return hotelMapper.getHotel(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelMapper.getAllHotel();
    }

    @Override
    public List<Hotel> getHotelsByName(String hotelName) {
        Hotel hotel = new Hotel();
        hotel.setHotelName(hotelName);
        return hotelMapper.queryHotel(hotel);
    }

    @Override
    public Hotel getHotelById(Integer hid) {
        return hotelMapper.getHotelById(hid);
    }

    /**
     * 这里是模糊查询
     *
     * @param address
     * @return
     */
    @Override
    public List<Hotel> getHotelsByAddress(String address) {
        return hotelMapper.getHotelsByAddress(address);
    }

    @Override
    public Integer addHotel(Hotel hotel) {
        int state = -1;
        if(hotel != null){
            state = hotelMapper.insertHotel(hotel);
            System.out.println("[SUC ADD HOTEL] : " + hotel);
        }
        return state;
    }

    @Override
    public Integer updateHotel(Hotel hotel) {
        int state = -1;
        if (hotel != null){
            state = hotelMapper.updateHotel(hotel);
            System.out.println("[SUC UPDATE] : " + hotel);
        }
        return state;
    }

    /**
     * todo 未使用
     *
     * @param hotel
     * @return
     */
    @Override
    public Integer deleteHotel(Hotel hotel) {
        return null;
    }
}
