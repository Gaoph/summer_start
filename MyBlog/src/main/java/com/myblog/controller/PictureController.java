package com.myblog.controller;

import com.alibaba.fastjson.JSON;
import com.myblog.common.entity.ResultMessage;
import com.myblog.entity.Picture;
import com.myblog.service.PictureService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 图片controller
 * Created by gaoph on 2016/11/15.
 */
@Controller
@RequestMapping("/picture")
public class PictureController extends BaseController {
    private PictureService pictureService;

    @RequestMapping("/upload_picture")
    public ResultMessage uploadPicture(@Param("jsonData") String jsonData) {
        ResultMessage resultMessage = new ResultMessage();
        List<Picture> pictures = JSON.parseArray(jsonData, Picture.class);
        pictureService.insertPictures(pictures);
        return resultMessage;
    }
}
