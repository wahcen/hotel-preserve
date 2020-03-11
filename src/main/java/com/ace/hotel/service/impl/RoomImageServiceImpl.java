package com.ace.hotel.service.impl;

import com.ace.hotel.dao.RoomImageMapper;
import com.ace.hotel.model.Room;
import com.ace.hotel.model.RoomImage;
import com.ace.hotel.service.RoomImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**房间图片服务，返回房间图片，主要属性是url
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.service.impl
 * @date 2019/11/7 20:57
 */
@Component("roomImageService")
public class RoomImageServiceImpl implements RoomImageService {
    private RoomImageMapper roomImageMapper;

    @Autowired
    public void setRoomImageMapper(RoomImageMapper roomImageMapper) {
        System.out.println("[DEPENDENCY INJECTION] : " + roomImageMapper.getClass().getSimpleName() + " [INTO] " + this.getClass().getSimpleName());
        this.roomImageMapper = roomImageMapper;
    }

    @Override
    public List<RoomImage> getRoomImages(Room room) {
        RoomImage roomImage = new RoomImage();
        roomImage.setHid(room.getHid());
        roomImage.setRoomType(room.getRoomType());
        return roomImageMapper.queryRoomImage(roomImage);
    }

    @Override
    public List<RoomImage> getRoomImages(Integer hid, String roomType) {
        return roomImageMapper.getRoomImage(hid, roomType);
    }
}
