package com.myblog.dao;

import com.myblog.entity.Picture;

import java.util.List;

public interface PictureMapper {
    int deleteByPrimaryKey(Integer picId);

    int insert(Picture record);

    int insertSelective(Picture record);

    Picture selectByPrimaryKey(Integer picId);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);

    /**
     * 获取所有的图片
     */
    List<Picture> selectPictures();
}