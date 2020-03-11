package com.ace.hotel.dao;

import java.util.List;

import com.ace.hotel.model.Room;
import org.apache.ibatis.annotations.Param;
import com.ace.hotel.model.RoomImage;
import com.ace.hotel.dao.base.RoomImageBaseMapper;
/**
*  @author author
*/
public interface RoomImageMapper extends RoomImageBaseMapper{
    public List<RoomImage> getRoomImage(@Param("hid") Integer hid, @Param("roomType") String roomType);

}