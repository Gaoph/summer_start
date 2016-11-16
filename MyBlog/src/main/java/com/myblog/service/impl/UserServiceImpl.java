package com.myblog.service.impl;

import com.myblog.dao.UserMapper;
import com.myblog.entity.User;
import com.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public boolean doLogin(HttpSession session, User user) {
        User temp = userMapper.selectByName(user);
        if (temp != null && temp.getUserPassword().equals(user.getUserPassword())) {
            session.putValue("user", temp);
            return true;
        }
        return false;
    }
}
