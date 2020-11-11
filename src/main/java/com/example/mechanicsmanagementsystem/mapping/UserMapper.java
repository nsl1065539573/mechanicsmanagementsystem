package com.example.mechanicsmanagementsystem.mapping;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return 用户的状态码 0-管理员 1-普通用户
     */
    Integer selectByUsernameAndPassword(@Param("username")String username, @Param("password")String password);

    /**
     * 用户注册
     * @param username 用户名
     * @param password 密码
     * @param state 状态码 0-管理员 1-普通用户
     * @return 插入的行数
     */
    Integer insertUser(@Param("username")String username,
                       @Param("password")String password,
                       @Param("state")Integer state,
                       @Param("nickname")String nickname);
}
