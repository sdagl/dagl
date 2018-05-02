package com.fuyun.controller;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fuyun.bean.UserInfo;
import com.fuyun.securty.service.IRoleService;

@Controller
public class LoginController {

	private final static String MAIN_PAGE = "index";
	private final static String LOGIN_PAGE = "login";
	private final static String REGISTER = "redirect:/";

	@Autowired
	IRoleService roleService;

	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request, Model model) {

		// 已经登录过，直接进入主页
		Subject subject = SecurityUtils.getSubject();
		if (subject != null && subject.isAuthenticated()) {
			boolean isAuthorized = Boolean.valueOf(subject.getSession()
					.getAttribute("isAuthorized").toString());
			if (isAuthorized)
				return MAIN_PAGE;
		}
		String userName = request.getParameter("userName");
		// 默认首页，第一次进来
		if (null == userName || "".equals(userName)) {
			return LOGIN_PAGE;
		}
		String password = request.getParameter("password");
		// 密码加密+加盐
System.out.println(password+"ASDASDASDADS");
		UsernamePasswordToken token = new UsernamePasswordToken(userName,
				password);
		token.setRememberMe(true);
		subject = SecurityUtils.getSubject();
		String msg;
		try {
			subject.login(token);
			// 通过认证
			if (subject.isAuthenticated()) {
				Set<String> roles = new HashSet<String>(
						roleService.getRoleByUsername(userName));
				if (!roles.isEmpty()) {
					subject.getSession().setAttribute("isAuthorized", true);
					subject.getSession().setAttribute("userName", new UserInfo(userName,password));
					subject.getSession().setAttribute("test", new UserInfo(userName,password));
					return MAIN_PAGE;
				} else {// 没有授权
					msg = "您没有得到相应的授权！";
					model.addAttribute("message", 1);
					subject.getSession().setAttribute("isAuthorized", false);

					return LOGIN_PAGE;
				}

			} else {
				return LOGIN_PAGE;
			}
			// 0 未授权 1 账号问题 2 密码错误 3 账号密码错误
		} catch (IncorrectCredentialsException e) {
			msg = "登录密码错误. Password for account " + token.getPrincipal()
					+ " was incorrect";
			model.addAttribute("message", 2);

		} catch (ExcessiveAttemptsException e) {
			msg = "登录失败次数过多";
			model.addAttribute("message", 3);

		} catch (LockedAccountException e) {
			msg = "帐号已被锁定. The account for username " + token.getPrincipal()
					+ " was locked.";
			model.addAttribute("message", 4);

		} catch (DisabledAccountException e) {
			msg = "帐号已被禁用. The account for username " + token.getPrincipal()
					+ " was disabled.";
			model.addAttribute("message", 5);

		} catch (ExpiredCredentialsException e) {
			msg = "帐号已过期. the account for username " + token.getPrincipal()
					+ "  was expired.";
			model.addAttribute("message", 6);

		} catch (UnknownAccountException e) {
			msg = "帐号不存在. There is no user with username of "
					+ token.getPrincipal();
			model.addAttribute("message", 7);

		} catch (UnauthorizedException e) {
			msg = "您没有得到相应的授权！" + e.getMessage();
			model.addAttribute("message", 8);

		}
		return LOGIN_PAGE;
	}
}
