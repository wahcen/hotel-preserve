package com.ace.hotel.controller;

import com.ace.hotel.exception.ConditionException;
import com.ace.hotel.model.*;
import com.ace.hotel.service.HotelImageService;
import com.ace.hotel.service.HotelService;
import com.ace.hotel.service.RoomImageService;
import com.ace.hotel.service.RoomService;
import com.ace.hotel.util.MsgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.controller
 * @date 2019/11/12 16:54
 */
@RequestMapping("/admin")
@Controller
public class AdminController {
    private HotelService hotelService;
    private HotelImageService hotelImageService;
    private RoomService roomService;
    private RoomImageService roomImageService;

    @Autowired
    public void setHotelService(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @Autowired
    public void setHotelImageService(HotelImageService hotelImageService) {
        this.hotelImageService = hotelImageService;
    }

    @Autowired
    public void setRoomService(RoomService roomService) {
        this.roomService = roomService;
    }

    @Autowired
    public void setRoomImageService(RoomImageService roomImageService) {
        this.roomImageService = roomImageService;
    }

    private Map<Hotel, List<HotelImage>> getAllHotelsInfo(){
        Map<Hotel, List<HotelImage>> hotelsInfo = new HashMap<>();
        List<Hotel> hotels = hotelService.getAllHotel();
        for (Hotel h : hotels){
            hotelsInfo.put(h, hotelImageService.getHotelImagesByHid(h.getHid()));
        }
        return hotelsInfo;
    }

    private Map<Hotel, List<HotelImage>> search(Hotel hotel){
        Map<Hotel, List<HotelImage>> hotelsInfo = new HashMap<>();
        System.out.println("[TRY SEARCH] : " + hotel);
        List<Hotel> hotels = hotelService.getHotels(hotel);
        for(Hotel h : hotels){
            List<HotelImage> images = hotelImageService.getHotelImagesByHid(h.getHid());
            hotelsInfo.put(h, images);
        }
        return hotelsInfo;
    }

    @RequestMapping("/index")
    public String showAdminIndex(ModelMap map){
        map.put("hotelsInfo", getAllHotelsInfo());
        return "admin/index";
    }

    @RequestMapping("/search")
    public String searchHotel(ModelMap map, Hotel hotel){
        Map<Hotel, List<HotelImage>> hotelsInfo = search(hotel);
        if (hotelsInfo.size() == 0) {
            map.put("message", "未查询到结果");
        } else {
            System.out.println("[SUC SEARCH] : " + hotelsInfo);
            map.put("hotelsInfo", hotelsInfo);
        }
        return "admin/index";
    }

    @RequestMapping("/searchRoom")
    public String searchRoom(ModelMap map, Hotel hotel){
        Map<Hotel, List<HotelImage>> hotelsInfo = search(hotel);
        map.put("hotelsInfo", hotelsInfo);
        return "admin/addRoom";
    }

    @RequestMapping("/updateHotel")
    @ResponseBody
    public ResponseVessel<Void> updateHotel(Hotel hotel){
        ResponseVessel<Void> rv = null;
        Integer state = hotelService.updateHotel(hotel);
        if(state == -1 || state == 0){
            rv = new ResponseVessel<>(MsgUtil.FAIL, "更新酒店信息失败");
        }else {
            rv = new ResponseVessel<>(MsgUtil.SUCCESS, "成功更新酒店信息");
        }
        return rv;
    }

    @RequestMapping("/addHotel")
    @ResponseBody
    public ResponseVessel<Void> addHotel(Hotel hotel){
        ResponseVessel<Void> rv = null;
        Integer state = hotelService.addHotel(hotel);
        if(state == 0 || state == -1){
            rv = new ResponseVessel<>(MsgUtil.FAIL, "添加失败");
        } else {
            rv = new ResponseVessel<>(MsgUtil.SUCCESS, "添加成功");
        }
        return rv;
    }

    @RequestMapping("/showAddHotel")
    public String showAddHotel(HttpSession session){
        return "admin/addHotel";
    }

    @RequestMapping("/addRoom")
    @ResponseBody
    public ResponseVessel<Void> addRoom(Room room){
        ResponseVessel<Void> rv = null;
        int state = -2;
        state = roomService.addRoom(room);
        if (state == 1){
            rv = new ResponseVessel<>(MsgUtil.SUCCESS, "添加房间成功");
        } else {
            rv = new ResponseVessel<>(MsgUtil.FAIL, "添加房间失败");
        }
        return rv;
    }

    @RequestMapping("/showAddRoom")
    public String showAddRoom(ModelMap map){
        map.put("hotelsInfo", getAllHotelsInfo());
        return "admin/addRoom";
    }

    @RequestMapping("/updateRoom")
    @ResponseBody
    public ResponseVessel<Void> updateRoom(Room room){
        ResponseVessel<Void> rv = null;
        int state = -2;
        System.out.println("[TRY UPDATE] : " + room);
        state = roomService.updateRoom(room);
        if(state == 1){
            rv = new ResponseVessel<>(MsgUtil.SUCCESS, "更新房间信息成功");
        } else {
            rv = new ResponseVessel<>(MsgUtil.FAIL, "更新房间信息失败");
        }
        return rv;
    }

    @RequestMapping("/showUpdateRoom")
    public String showUpdateRoom(ModelMap map, Integer hid){
        Map<Room, List<RoomImage>> roomsInfo = new HashMap<>();
        List<Room> rooms = roomService.getRoomsByHid(hid);
        for(Room r : rooms){
            roomsInfo.put(r, roomImageService.getRoomImages(hid, r.getRoomType()));
        }
        map.put("roomsInfo", roomsInfo);
        return "admin/updateRoom";
    }

    @ExceptionHandler
    public String execute(HttpServletRequest request,
                          HttpServletResponse response, Exception e) throws Exception {
        if(e instanceof ConditionException) {
            //业务异常自己处理
            request.setAttribute("message", e.getMessage());
            request.setAttribute(
                "cond", request.getParameter("cond"));
            request.setAttribute(
                "pwd", request.getParameter("pwd"));
            return "login";
        } else {
            //系统异常抛出，交给Spring处理
            throw e;
        }
    }
}
