package com.example.mechanicsmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 负责映射html文件
 */
@Controller
public class MainController {
    @RequestMapping("login")
    public String login() {
        return "login_copy.html";
    }

    @RequestMapping("register")
    public String register() {
        return "register.html";
    }
}
