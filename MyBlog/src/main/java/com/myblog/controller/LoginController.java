package com.myblog.controller;

import com.myblog.entity.User;
import com.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 登录和注册的controller
 * Created by Administrator on 2016/11/16.
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {
    @Autowired
    private UserService userService;

    /**
     * 跳往登录页面
     */
    @RequestMapping("/to_login")
    public String login() {
        return "login";
    }

    /**
     * 跳往主页
     */
    @RequestMapping("/home")
    public String goHome() {
        return "home";
    }

    /**
     * 登录
     */
    @RequestMapping("/do_login")
    public String doLogin(ModelMap modelMap, HttpServletRequest request, User user) {
        HttpSession session = request.getSession();
        boolean flag = userService.doLogin(session, user);
        if (flag)
            return "redirect:/login/home";
        else {
            modelMap.put("msg", "登录失败");
            return "login";
        }

    }
}
