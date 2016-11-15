package com.myblog.service;

import com.myblog.entity.Picture;

import java.util.List;

/**
 * 图片service接口
 * Created by gaoph on 2016/11/15.
 */
public interface PictureService {
    /**
     * 获取数据库中所有的图片
     */
    List<Picture> selectPictures();

    /**
     * 插入新图片
     */
    boolean insertPictures(List<Picture> pictures);
}
