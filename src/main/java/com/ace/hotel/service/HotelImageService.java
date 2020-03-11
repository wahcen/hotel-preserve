package com.ace.hotel.service;

import com.ace.hotel.model.Hotel;
import com.ace.hotel.model.HotelImage;

import java.util.List;
import java.util.Map;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.service
 * @date 2019/11/4 1:29
 */
public interface HotelImageService {
    public List<HotelImage> getHotelImagesByHid(Integer hid);

    public Map<Hotel, List<HotelImage>> getHotelsAndImages(List<Integer> hidList);
}
