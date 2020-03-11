package com.ace.hotel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.ace.hotel.model.Room;
import com.ace.hotel.dao.base.RoomBaseMapper;

/**
 * @author author
 */
public interface RoomMapper extends RoomBaseMapper {
    public List<Room> getRoomsByHid(Integer hid);
    public Room getRoom(@Param("hid") Integer hid, @Param("roomType") String roomType);
}