package com.ace.hotel.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.ace.hotel.model.RoomImage;
/**
*  @author author
*/
public interface RoomImageBaseMapper {

    int insertRoomImage(RoomImage object);

    int updateRoomImage(RoomImage object);

    int update(RoomImage.UpdateBuilder object);

    List<RoomImage> queryRoomImage(RoomImage object);

    RoomImage queryRoomImageLimit1(RoomImage object);

}