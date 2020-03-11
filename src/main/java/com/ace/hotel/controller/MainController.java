package com.ace.hotel.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这个控制器用于不需要拦截器的页面，比如主页，登录，注册等页面
 * 命名规范： showPageName 即show页面名
 *
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.controller
 * @date 2019/10/31 13:46
 */
@Component("mainController")
@RequestMapping("/main")
public class MainController {
    @RequestMapping("/showIndex")
    public String index() {
        return "index";
    }

    @RequestMapping("/showLogin")
    public String showLogin() {
        return "login";
    }

    @RequestMapping("/showRegister")
    public String showRegister() {
        return "register";
    }

}
