package com.ace.hotel.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Ace.ch
 * @version V1.0
 * @Package interceptor
 * @date 2019/10/29 16:16
 */
public class UserInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("[INTERCEPTOR] : " + this.getClass().getSimpleName() + " [PRE HANDLE]");
        HttpSession session = request.getSession();
        Object obj = session.getAttribute("user");
        if (obj == null) {
            response.sendRedirect(request.getContextPath() + "/main/showLogin.do");
        }
        return obj != null;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("[INTERCEPTOR] : " + this.getClass().getSimpleName() + " [POST HANDLE]");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("[INTERCEPTOR] : " + this.getClass().getSimpleName() + " [AFTER COMPLETION]");
    }

}
