package com.ace.hotel.service.impl;

import com.ace.hotel.dao.HotelImageMapper;
import com.ace.hotel.dao.HotelMapper;
import com.ace.hotel.model.Hotel;
import com.ace.hotel.model.HotelImage;
import com.ace.hotel.service.HotelImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.service.impl
 * @date 2019/11/4 1:36
 */
@Component("hotelImageService")
public class HotelImageServiceImpl implements HotelImageService {
    private HotelImageMapper hotelImageMapper;
    private HotelMapper hotelMapper;

    @Autowired
    public void setHotelMapper(HotelMapper hotelMapper) {
        System.out.println("[DEPENDENCY INJECTION] : " + hotelMapper.getClass().getSimpleName() + " [INTO] " + this.getClass().getSimpleName());
        this.hotelMapper = hotelMapper;
    }

    @Autowired
    public void setHotelImageMapper(HotelImageMapper hotelImageMapper) {
        System.out.println("[DEPENDENCY INJECTION] : " + hotelImageMapper.getClass().getSimpleName() + " [INTO] " + this.getClass().getSimpleName());
        this.hotelImageMapper = hotelImageMapper;
    }

    @Override
    public Map<Hotel, List<HotelImage>> getHotelsAndImages(List<Integer> hidList) {
        Map<Hotel, List<HotelImage>> hotelsAndImages = new HashMap<>();
        for(Integer hid : hidList){
            hotelsAndImages.put(hotelMapper.getHotelById(hid),this.getHotelImagesByHid(hid));
        }
        return hotelsAndImages;
    }

    @Override
    public List<HotelImage> getHotelImagesByHid(Integer hid) {
        HotelImage query = new HotelImage();
        query.setHid(hid);
        return hotelImageMapper.queryHotelImage(query);
    }
}
