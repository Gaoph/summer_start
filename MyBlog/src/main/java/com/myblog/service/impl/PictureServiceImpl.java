package com.myblog.service.impl;

import com.myblog.dao.PictureMapper;
import com.myblog.entity.Picture;
import com.myblog.service.PictureService;
import com.myblog.utils.PropertiesTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 图片service
 * Created by gaoph on 2016/11/15.
 */
@Service
public class PictureServiceImpl implements PictureService {
    @Autowired
    private PictureMapper pictureMapper;

    @Override
    public List<Picture> selectPictures() {
        List<Picture> pictures = pictureMapper.selectPictures();
        for (Picture picture : pictures) {
            picture.setPicPath(picture.getPicPath().replace(PropertiesTool.PICTURE_PATH, PropertiesTool.STATIC_PICTURE_PATH));
        }
        return pictures;
    }

    @Override
    public boolean insertPictures(List<Picture> pictures) {
        for (Picture picture : pictures) {
            pictureMapper.insertSelective(picture);
        }
        return true;
    }
}
