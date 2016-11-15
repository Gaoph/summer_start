package com.myblog.service.impl;

import com.myblog.dao.PictureMapper;
import com.myblog.entity.Picture;
import com.myblog.service.PictureService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 图片service
 * Created by gaoph on 2016/11/15.
 */
@Service
public class PictureServiceImpl implements PictureService {
    private PictureMapper pictureMapper;

    @Override
    public List<Picture> selectPictures() {
        return pictureMapper.selectPictures();
    }

    @Override
    public boolean insertPictures(List<Picture> pictures) {
        for (Picture picture : pictures) {
            pictureMapper.insertSelective(picture);
        }
        return true;
    }
}
