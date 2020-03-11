package com.ace.hotel.service.impl;

import com.ace.hotel.dao.RoomMapper;
import com.ace.hotel.model.Room;
import com.ace.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * todo 房间服务
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.service.impl
 * @date 2019/11/4 20:17
 */
@Component("roomService")
public class RoomServiceImpl implements RoomService {
    private RoomMapper roomMapper;

    @Autowired
    public void setRoomMapper(RoomMapper roomMapper) {
        System.out.println("[DEPENDENCY INJECTION] : " + roomMapper.getClass().getSimpleName() + " [INTO] " + this.getClass().getSimpleName());
        this.roomMapper = roomMapper;
    }

    @Override
    public List<Room> getRooms(Room room) {
        return roomMapper.queryRoom(room);
    }

    @Override
    public List<Room> getRoomsByHid(Integer hid) {
        return roomMapper.getRoomsByHid(hid);
    }

    @Override
    public Integer addRoom(Room room) {
        int state = -1;
        if (room != null){
            state = roomMapper.insertRoom(room);
        }
        return state;
    }

    @Override
    public Integer updateRoom(Room room) {
        int state = -1;
        if (room != null){
            state = roomMapper.updateRoom(room);
        }
        return state;
    }

    @Override
    public Integer deleteRoom(Room room) {
        return null;
    }
}
