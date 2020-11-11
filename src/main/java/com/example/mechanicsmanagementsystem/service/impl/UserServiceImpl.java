package com.example.mechanicsmanagementsystem.service.impl;

import com.example.mechanicsmanagementsystem.mapping.UserMapper;
import com.example.mechanicsmanagementsystem.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public Integer selectByUsernameAndPassword(String username, String password) {
        return userMapper.selectByUsernameAndPassword(username, password);
    }

    @Override
    public Integer register(String username, String password, Integer state, String nickName) {
        return userMapper.insertUser(username, password, state, nickName);
    }
}
