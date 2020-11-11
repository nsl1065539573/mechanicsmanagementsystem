package com.example.mechanicsmanagementsystem.service;

public interface UserService {
    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return 用户状态码 0-管理员 1-普通用户
     */
    public Integer selectByUsernameAndPassword(String username, String password);

    public Integer register(String username, String password, Integer state, String nickName);
}
