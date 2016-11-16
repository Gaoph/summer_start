package com.myblog.dao;

import com.myblog.entity.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getUserList();

    /**
     * 根据用户名查询用户
     * @param user
     * @return
     */
    User selectByName(User user);
}