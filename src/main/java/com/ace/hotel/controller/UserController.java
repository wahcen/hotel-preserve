package com.ace.hotel.controller;

import com.ace.hotel.model.Order;
import com.ace.hotel.model.ResponseVessel;
import com.ace.hotel.model.User;
import com.ace.hotel.service.OrderService;
import com.ace.hotel.util.MsgUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.ace.hotel.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * ResponseVessel<>是一个POJO对象，其封装了响应状态码以及需要说明的消息，必要时还可以添加数据
 * / @ResponseBody注解表示，返回的内容直接封装到响应体中，而不是转发给其他jsp或servlet
 * 返回该对象时，jackson会自动将它转为json格式的响应对象并封装到响应体中
 *
 * @author Ace.ch
 * @version V1.0
 * @Package controller
 * @date 2019/10/27 17:50
 */
@Controller("userController") //使用@Controller注解表示它是一个控制器
@RequestMapping("/user") //表示当请求的URI在/user下时，该控制器响应
public class UserController {
    private UserService userService;
    private OrderService orderService;

    @Autowired
    public void setOrderService(OrderService orderService) {
        System.out.println("[DEPENDENCY INJECTION] : " + orderService.getClass().getSimpleName() + " [INTO] " + this.getClass().getSimpleName());
        this.orderService = orderService;
    }

    @Autowired
    @Qualifier("userServiceImpl")
    public void setUserService(UserService userService) {
        System.out.println("[DEPENDENCY INJECTION] : " + userService.getClass().getSimpleName() + " [INTO] " + this.getClass().getSimpleName());
        this.userService = userService;
    }

    /**
     * Spring的传递比较智能化，函数的参数名与HTTP请求的一致则无需注解
     * 可以使用@RequestParam获取客户端请求的参数，若参数名与请求参数名一致则无需注解 例：@RequestParam("username") String username
     * 使用@RequestAttribute获取请求属性 例：@RequestAttribute("username") String username
     * 使用@SessionAttribute获取session中保存的属性，因此函数参数可以不获取session 例：@SessionAttribute("user") User user
     * 使用@CookieValue获取客户端cookie保存的内容 例：@CookieValue(value="JSESSIONID", required=true)
     * 使用@RequestHeader获取客户端request请求头参数 例：@RequestHeader(value="User-Agent", required=false)
     */
    @RequestMapping("/login")
    @ResponseBody
    public ResponseVessel<Void> login(String phone, String password, HttpSession session) {
        ResponseVessel<Void> rv;
        System.out.println("[TRY LOGIN] : " + phone + " => " + password);
        User user = userService.login(phone, password);
        if (user != null) {
            System.out.println("[SUC LOGIN] : " + user);
            session.setAttribute("user", user);
            rv = new ResponseVessel<>(MsgUtil.SUCCESS, "登录成功");
            if (user.getAuthType().equals(MsgUtil.ADMIN)){
                rv.setMessage(MsgUtil.ADMIN);
            }
        } else {
            rv = new ResponseVessel<>(MsgUtil.FAIL, "用户名或密码错误");
        }
        return rv;
    }

    @RequestMapping("/register")
    @ResponseBody
    public ResponseVessel<Void> register(User user) {
        ResponseVessel<Void> rv;
        System.out.println("[TRY REGISTER] : " + user);
        user.setRegisterDate(LocalDateTime.now());
        int stateCode = userService.register(user);
        if (stateCode > 0) {
            System.out.println("[SUC REGISTER] : " + user);
            rv = new ResponseVessel<>(MsgUtil.SUCCESS, "注册成功");
        }
        switch (stateCode) {
            case -1:
                rv = new ResponseVessel<>(MsgUtil.FAIL, "手机号已被注册");
                break;
            case -2:
                rv = new ResponseVessel<>(MsgUtil.FAIL, "身份证已被注册");
                break;
            case -3:
                rv = new ResponseVessel<>(MsgUtil.FAIL, "身份证、手机号都已被注册");
                break;
            default:
                rv = new ResponseVessel<>(MsgUtil.FAIL, "未知错误");
        }
        return rv;
    }


    @RequestMapping("/updateUser")
    @ResponseBody
    public ResponseVessel<Void> updateUser(User user, HttpSession session) {
        ResponseVessel<Void> rv;
        int state = userService.updateUser(user);
        System.out.println("[TRY UPDATE] : " + user);
        if (state == 1) {
            System.out.println("[SUC UPDATE] : " + user);
            rv = new ResponseVessel<>(MsgUtil.SUCCESS, "修改成功");
            //更新session
            User u = (User) session.getAttribute("user");
            u.setUserName(user.getUserName());
            u.setEmail(user.getEmail());
            u.setIdCard(user.getIdCard());
            u.setPhone(user.getPhone());
            session.setAttribute("user", u);
        } else {
            rv = new ResponseVessel<>(MsgUtil.FAIL, "修改失败");
        }
        return rv;
    }

    /**
     * 返回ajax异步请求结果
     *
     * @return
     */
    @RequestMapping("/checkPhone")
    @ResponseBody //@ResponseBody注解标识该方法的返回值直接写回到HTTP响应体中去
    public ResponseVessel<Void> checkPhone(String phone) {
        ResponseVessel<Void> rv;
        if (userService.checkPhoneExists(phone)) {
            rv = new ResponseVessel<>(MsgUtil.FAIL, "手机号已被注册");
        } else {
            rv = new ResponseVessel<>(MsgUtil.SUCCESS, "手机号可以使用");
        }
        return rv;
    }

    /**
     * 返回ajax异步请求结果
     *
     * @return
     */
    @RequestMapping("/checkIdCard")
    @ResponseBody
    public ResponseVessel<Void> checkIdCard(String idCard) {
        ResponseVessel<Void> rv;
        if (userService.checkIdCardExists(idCard)) {
            rv = new ResponseVessel<>(MsgUtil.FAIL, "身份证已被注册");
        } else {
            rv = new ResponseVessel<>(MsgUtil.SUCCESS, "身份证可以使用");
        }
        return rv;
    }

    /**
     * 返回ajax异步请求结果
     *
     * @return
     */
    @RequestMapping("/checkEmail")
    @ResponseBody
    public ResponseVessel<Void> checkEmail(String email) {
        ResponseVessel<Void> rv;
        if (userService.checkEmailExists(email)) {
            rv = new ResponseVessel<>(MsgUtil.FAIL, "邮箱已被注册");
        } else {
            rv = new ResponseVessel<>(MsgUtil.SUCCESS, "邮箱可以使用");
        }
        return rv;
    }

    /**
     * todo 展示用户个人信息，类似于个人空间
     * 过程： 1.函数返回视图名"userDetail"和数据模型"map"
     * 2.产生Jstl视图
     * 3.将数据模型map和Jstl视图绑定到一个ModelAndView
     * 4.根据视图解析器配置的前缀、后缀和视图名组装得到响应jsp位置
     * SpringMVC会将参数中的ModelMap数据模型和userDetail.jsp视图绑定到一个ModelAndView中
     *
     * @param map 数据模型
     * @return 视图名 因为配置了InternalResourceViewResolver视图解析器，返回的字符串，最后表示的是 prefix/path/suffix，本项目中代表 page/userDetail.jsp
     */
    @RequestMapping("/showUserDetail")
    public String showUserDetail(ModelMap map) {
        return "userDetail";
    }

    @RequestMapping("/showOrderDetail")
    public String showOderDetail(ModelMap map, @SessionAttribute("user") User user) {
        List<Order> orders;
        orders = orderService.getOrdersByPhone(user.getPhone());
        map.addAttribute("orders", orders);
        return "oderDetail";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/main/showIndex.do";
    }

    /**
     * todo 上传图片功能，等待重写
     *
     * @param map
     * @param file
     * @param req
     * @return
     */
    @RequestMapping("/upload")
    public String upload(ModelMap map, MultipartFile file, HttpServletRequest req) {
        //获取文件名
        String fileName = file.getOriginalFilename();
        //获取文件类型
        String contentType = file.getContentType();
        if (contentType == null || !contentType.startsWith("image/")) {
            map.addAttribute("success", false);
            map.addAttribute("msg", "文件类型非法");
            return "welcome";
        }
        //动态获取upload文件夹位置, 由于IDEA使用热部署获取真实路径会得到调试路径，导致upload路径非法，因此指定了本地位置
//        ServletContext context = req.getServletContext();
//        String upPath = context.getRealPath("/upload");
        String upPath = new String("C:\\Users\\Ace.ch\\Desktop");
        //产生随机文件名
        fileName = UUID.randomUUID().toString() + fileName.substring(fileName.lastIndexOf('.'));
        File dest = new File(upPath, fileName);
        try {
            file.transferTo(dest);
            map.addAttribute("success", true);
            map.addAttribute("msg", "文件上传成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "welcome";
    }


}
