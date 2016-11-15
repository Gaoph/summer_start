package com.myblog.controller;

import com.myblog.common.entity.ResultMessage;
import com.myblog.entity.User;
import com.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * com.myblog.controller
 * Created by gaoph on 2016/10/31.
 */
@Controller
@RequestMapping("/welcome")
public class BaseController {
    @Autowired
    private UserService userService;

    @RequestMapping("/get_list")
    @ResponseBody
    public ResultMessage getUserList() {
        ResultMessage resultMessage = new ResultMessage();
        List<User> userList = userService.getUserList();
        resultMessage.setSuccess(true);
        resultMessage.setObj(userList);
        return resultMessage;
    }

    @RequestMapping("/home")
    public String goHome(ModelMap modelMap) {
        List<User> userList = userService.getUserList();
        modelMap.put("userList", userList);
        return "home";
    }

    @RequestMapping("/login")
    public String login(ModelMap modelMap) {
        return "login";
    }

    @RequestMapping("/index")
    public String index(ModelMap modelMap) {
        return "index";
    }
}
