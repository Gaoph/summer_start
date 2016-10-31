package com.myblog.service;

import com.myblog.dao.UserMapper;
import com.myblog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户service
 * Created by gaoph on 2016/10/31.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getUser() {
        return userMapper.getUserList();
    }
}
