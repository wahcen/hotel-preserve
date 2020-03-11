package com.ace.hotel.dao.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.ace.hotel.model.Room;

/**
 * @author author
 */
public interface RoomBaseMapper {

    int insertRoom(Room object);

    int updateRoom(Room object);

    int update(Room.UpdateBuilder object);

    List<Room> queryRoom(Room object);

    Room queryRoomLimit1(Room object);

}