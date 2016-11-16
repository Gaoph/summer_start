package com.myblog.controller;

import com.myblog.entity.User;
import com.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 管理用户的Controller
 * Created by Administrator on 2016/11/16.
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    @RequestMapping("/get_users")
    public String getUsers(ModelMap modelMap) {
        List<User> userList = userService.getUserList();
        modelMap.put("userList", userList);
        return "user_list";
    }
}
