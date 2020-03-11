package com.ace.hotel.interceptor;

import com.ace.hotel.util.MsgUtil;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.ace.hotel.model.User;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package com.ace.hotel.interceptor
 * @date 2019/11/12 22:00
 */
public class AdminInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("[INTERCEPTOR] : " + this.getClass().getSimpleName() + " [PRE HANDLE]");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null || !user.getAuthType().equals(MsgUtil.ADMIN)){
            response.sendRedirect(request.getContextPath() + "/main/showLogin.do");
        }
        return user != null && user.getAuthType().equals(MsgUtil.ADMIN);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("[INTERCEPTOR] : " + this.getClass().getSimpleName() + " [POST HANDLE]");
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("[INTERCEPTOR] : " + this.getClass().getSimpleName() + " [POST HANDLE]");
        super.afterCompletion(request, response, handler, ex);
    }
}
