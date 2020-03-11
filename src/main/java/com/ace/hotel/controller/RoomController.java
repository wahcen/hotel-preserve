package com.ace.hotel.controller;

import com.ace.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**todo Room控制器，用于管理员控制
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.controller
 * @date 2019/11/4 20:07
 */
@Controller("roomController")
@RequestMapping("/room")
public class RoomController {
    private RoomService roomService;

    @Autowired
    public void setRoomService(RoomService roomService) {
        System.out.println("[DEPENDENCY INJECTION] : " + roomService.getClass().getSimpleName() + " [INTO] " + this.getClass().getSimpleName());
        this.roomService = roomService;
    }

}
