package com.myblog.utils;

import java.util.ResourceBundle;

/**
 * 获取Properties文件的工具类
 * Created by gaoph on 2016/11/15.
 */
public class PropertiesTool {
    public static ResourceBundle resource = ResourceBundle.getBundle("properties/init");

    public static String PICTURE_PATH = resource.getString("pictureUrl");

    public static String STATIC_PATH = resource.getString("staticUrl");
}
