package com.ace.hotel.service;

import com.ace.hotel.model.Room;
import com.ace.hotel.model.RoomImage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.service
 * @date 2019/11/7 20:55
 */
public interface RoomImageService {
    public List<RoomImage> getRoomImages(Room room);
    public List<RoomImage> getRoomImages(@Param("hid") Integer hid, @Param("roomType") String roomType);
}
