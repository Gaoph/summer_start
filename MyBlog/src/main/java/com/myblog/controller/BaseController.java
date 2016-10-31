package com.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * com.myblog.controller
 * Created by gaoph on 2016/10/31.
 */
@Controller
@RequestMapping("/welcome")
public class BaseController {
    @RequestMapping("/welcome")
    public String goWelcome() {
        return "welcome";
    }

    @RequestMapping("/home")
    public String goHome() {
        return "home";
    }
}
