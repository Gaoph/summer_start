package com.myblog.service;

import com.myblog.dao.UserMapper;
import com.myblog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 用户service
 * Created by gaoph on 2016/10/31.
 */
public interface UserService {
    List<User> getUserList();

    boolean doLogin(HttpSession session, User user);
}