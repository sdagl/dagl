package com.fuyun.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SecureHandlerInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		HttpSession session = request.getSession();
		System.out.println("全局控制层");
		if (session.getAttribute("log") == null) {
			//System.out.println("全局控制层："+session.getAttribute("logUser"));
			session.setAttribute("info", "还没登录");
			session.setAttribute("info_url", "index.html");
			response.sendRedirect("/message.jsp");
			return false;
		}	
		return true;
	}



}
