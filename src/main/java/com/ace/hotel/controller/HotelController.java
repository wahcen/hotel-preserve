package com.ace.hotel.controller;

import com.ace.hotel.model.*;
import com.ace.hotel.service.HotelImageService;
import com.ace.hotel.service.HotelService;
import com.ace.hotel.service.RoomImageService;
import com.ace.hotel.service.RoomService;
import com.ace.hotel.util.MsgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * todo 实现获取酒店信息功能，例如向modelMap传递一个Hotel数组，其中包含了酒店的名称、地址、电话、简介
 * fixme 由于酒店一般拥有多张图片，而Hotel类中没有图片属性，且数据库中不能保存字符串数组，需要重新新增HotelPicture类
 * todo 实现类似于UserController的功能，对酒店的增删改查，用于管理员管理
 *
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.controller
 * @date 2019/11/3 2:56
 */
@Controller("hotelController")
@RequestMapping("/hotel")
public class HotelController {
    private HotelService hotelService;
    private RoomService roomService;
    private HotelImageService hotelImageService;
    private RoomImageService roomImageService;

    @Autowired
    public void setRoomImageService(RoomImageService roomImageService) {
        System.out.println("[DEPENDENCY INJECTION] : " + roomImageService.getClass().getSimpleName() + " [INTO] " + this.getClass().getSimpleName());
        this.roomImageService = roomImageService;
    }

    @Autowired
    public void setRoomService(RoomService roomService) {
        System.out.println("[DEPENDENCY INJECTION] : " + roomService.getClass().getSimpleName() + " [INTO] " + this.getClass().getSimpleName());
        this.roomService = roomService;
    }

    @Autowired
    public void setHotelService(HotelService hotelService) {
        System.out.println("[DEPENDENCY INJECTION] : " + hotelService.getClass().getSimpleName() + " [IN] " + this.getClass().getSimpleName());
        this.hotelService = hotelService;
    }

    @Autowired
    public void setHotelImageService(HotelImageService hotelImageService) {
        System.out.println("[DEPENDENCY INJECTION] : " + hotelImageService.getClass().getSimpleName() + " [INTO] " + this.getClass().getSimpleName());
        this.hotelImageService = hotelImageService;
    }

    @RequestMapping("/showAllHotels")
    public String showAllHotels(ModelMap map) {
        Map<Hotel, List<HotelImage>> hotelsInfo = new HashMap<>();
        List<Hotel> hotels = hotelService.getAllHotel();
        for (Hotel h : hotels){
            hotelsInfo.put(h, hotelImageService.getHotelImagesByHid(h.getHid()));
        }
        map.put("hotelsInfo", hotelsInfo);
        return "hotelsInfo";
    }

    @RequestMapping("/showHotelDetail")
    public String showHotelDetail(ModelMap map, Integer hid) {
        Hotel hotel = hotelService.getHotelById(hid);
        List<HotelImage> hotelImages = hotelImageService.getHotelImagesByHid(hid);
        Map<Room, List<RoomImage>> roomsInfo = new HashMap<>();
        List<Room> rooms = roomService.getRoomsByHid(hid);
        for(Room r : rooms){
            List<RoomImage> roomImages = roomImageService.getRoomImages(r.getHid(), r.getRoomType());
            roomsInfo.put(r, roomImages);
        }
        System.out.println("[HOTEL DETAIL] : " + hotel);
        System.out.println("[HOTEL IMAGES] : " + hotelImages);
        System.out.println("[ROOM DETAIL] : " + roomsInfo);
        map.addAttribute("hotelDetail", hotel);
        map.addAttribute("hotelImages", hotelImages);
        map.addAttribute("roomsDetail", roomsInfo);
        return "hotelDetail";
    }


    @RequestMapping("/searchHotel")
    public String searchHotel(ModelMap map, Hotel hotel) {
        Map<Hotel, List<HotelImage>> hotelsInfo = new HashMap<>();
        System.out.println("[TRY SEARCH] : " + hotel);
        List<Hotel> hotels = hotelService.getHotels(hotel);
        for(Hotel h : hotels){
            List<HotelImage> images = hotelImageService.getHotelImagesByHid(h.getHid());
            hotelsInfo.put(h, images);
        }
        if (hotelsInfo.size() == 0) {
            map.put("message", "未查询到结果");
        } else {
            System.out.println("[SUC SEARCH] : " + hotelsInfo);
            map.put("hotelsInfo", hotelsInfo);
        }
        return "hotelsInfo";
    }

//    /**
//     * todo 在HotelService中引入HotelImageMapper，并提供getHotelImagesByHid()函数
//     * todo 将ModelMap返回值改为Map<Hotel, List<HotelImage>>类型（首选，因为图片有大小）或Map<Hotel,List<String>>类型其中String即图片的URL地址
//     * @param map
//     * @param hotel
//     * @return
//     */
//    @RequestMapping("/searchHotel1")
//    public String searchHotel(ModelMap map, Hotel hotel) {
//        List<Hotel> hotels;
//        System.out.println("[TRY SEARCH] : " + hotel);
//        hotels = hotelService.getHotelsByAddress(hotel.getAddress());
//        if (hotels.size() == 0) {
//            map.put("message", "未查询到结果");
//        } else {
//            System.out.println("[SUC SEARCH] : " + hotels);
//            map.put("hotels", hotels);
//        }
//        return "hotels";
//    }

//    @RequestMapping("/searchHotel")
//    @ResponseBody
//    public ResponseVessel<List<Hotel>> searchHotel(ModelMap map, Hotel hotel){
//        ResponseVessel<List<Hotel>> rv;
//        List<Hotel> hotels;
//        System.out.println("[TRY SEARCH] : " + hotel);
//        hotels = hotelService.getHotelsByAddress(hotel.getAddress());
//        if(hotels.size() == 0){
//            rv = new ResponseVessel<>(MsgUtil.FAIL,"未查询到结果", hotels);
//        }else{
//            System.out.println("[SUC SEARCH] : " + hotels);
//            rv = new ResponseVessel<>(MsgUtil.SUCCESS,"查询到"+hotels.size()+"条结果", hotels);
//        }
//        return rv;
//    }
}
