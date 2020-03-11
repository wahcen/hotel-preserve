package com.ace.hotel.service;

import com.ace.hotel.model.Hotel;

import java.util.List;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.service
 * @date 2019/11/2 2:04
 */
public interface HotelService {
    public List<Hotel> getHotels(Hotel hotel);

    public List<Hotel> getAllHotel();

    public List<Hotel> getHotelsByName(String hotelName);

    public Hotel getHotelById(Integer hid);

    public List<Hotel> getHotelsByAddress(String address);

    public Integer addHotel(Hotel hotel);

    public Integer updateHotel(Hotel hotel);

    public Integer deleteHotel(Hotel hotel);
}
