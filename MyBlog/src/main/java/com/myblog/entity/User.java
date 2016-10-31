package com.myblog.entity;

/**
 * 用户实体类
 * Created by gaoph on 2016/10/31.
 */
public class User {
    /**
     * 主键
     */
    private int userId;
    /**
     * 用户名
     */
    private String name;
    /**
     * 密码
     */
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
