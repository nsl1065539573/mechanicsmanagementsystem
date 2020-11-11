package com.example.mechanicsmanagementsystem.controller;

import com.example.mechanicsmanagementsystem.service.UserService;
import com.example.mechanicsmanagementsystem.utils.JavaWebToken;
import com.example.mechanicsmanagementsystem.utils.ServerResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import java.util.HashMap;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    /**
     * 登录接口，生成token
     * @param username 用户名
     * @param password 密码
     * @return 成功状态码 token
     */
    @RequestMapping("/login")
    @ResponseBody
    public ServerResponse login(@RequestParam("username")String username,
                                @RequestParam("password")String password){
        System.out.println("username:" + username +"  password:" + password);
        Integer state = userService.selectByUsernameAndPassword(username, password);
        if (state == null) {
            return ServerResponse.serverFailed();
        } else if (state == 1 || state == 0) {
            HashMap<String, String> map = new HashMap<>();
            HashMap<String, Object> claims = new HashMap<>();
            claims.put("username", username);
            claims.put("state", state);
            map.put("token", JavaWebToken.createToken(claims));
            return ServerResponse.serverSuccess(map);
        } else {
            return ServerResponse.serverFailed();
        }
}

    @RequestMapping("/register")
    public ServerResponse register(@RequestParam("username")String username,
                                   @RequestParam("password")String password,
                                   @RequestParam("nickname")String nickname) {
        Integer res = userService.register(username, password, 1, nickname);
        if (res > 0) {
            return ServerResponse.serverSuccess();
        }
        return ServerResponse.serverFailed();
    }
}
