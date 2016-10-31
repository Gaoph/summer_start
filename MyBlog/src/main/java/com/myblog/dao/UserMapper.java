package com.myblog.dao;

import com.myblog.entity.User;

import java.util.List;

/**
 * 用户Map
 * Created by gaoph on 2016/10/31.
 */
public interface UserMapper {
    List<User> getUserList();
}
