package com.ace.hotel.service;

import com.ace.hotel.model.Room;

import java.util.List;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.service
 * @date 2019/11/2 2:05
 */
public interface RoomService {
    public List<Room> getRooms(Room room);

    public List<Room> getRoomsByHid(Integer hid);

    public Integer addRoom(Room room);

    public Integer updateRoom(Room room);

    public Integer deleteRoom(Room room);
}
