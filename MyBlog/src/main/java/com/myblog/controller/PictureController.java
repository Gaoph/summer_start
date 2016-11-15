package com.myblog.controller;

import com.alibaba.fastjson.JSON;
import com.myblog.common.entity.ResultMessage;
import com.myblog.entity.Picture;
import com.myblog.service.PictureService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 图片controller
 * Created by gaoph on 2016/11/15.
 */
@Controller
@RequestMapping("/picture")
public class PictureController extends BaseController {
    @Autowired
    private PictureService pictureService;

    /**
     * 跳往上传图片页面
     */
    @RequestMapping("/to_upload")
    public String toUpload() {
        return "picture";
    }

    /**
     * 上传图片数据插入数据库
     */
    @RequestMapping("/upload_picture")
    @ResponseBody
    public ResultMessage uploadPicture(@Param("jsonData") String jsonData) {
        ResultMessage resultMessage = new ResultMessage();
        List<Picture> pictures = JSON.parseArray(jsonData, Picture.class);
        pictureService.insertPictures(pictures);
        return resultMessage;
    }

    /**
     * 跳往上传图片页面
     */
    @RequestMapping("/get_picture_list")
    public String getPictures(ModelMap modelMap) {
        List<Picture> pictures = pictureService.selectPictures();
        modelMap.put("pictures", pictures);
        return "picture_list";
    }
}
