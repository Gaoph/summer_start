package com.myblog.controller;

import com.alibaba.fastjson.JSON;
import com.myblog.common.entity.ResultMessage;
import com.myblog.common.entity.UploadFile;
import com.myblog.utils.PropertiesTool;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.apache.commons.io.FileUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;;
import java.util.List;
import java.util.UUID;

/**
 * 上传文件的Controller
 * Created by gaoph on 2016/11/15.
 */
@Controller
public class UploadController{
    /**
     * 文件上传
     *
     * @param type 文件类型
     */
    @RequestMapping("/upload")
    public ResultMessage upload(@RequestParam MultipartFile[] Filedata, HttpServletResponse response, @Param("type") String type) {
        ResultMessage resultMessage = new ResultMessage();

        List<UploadFile> uploadFileList = new ArrayList<UploadFile>();

        String realPath = null;
        //处理供应商相册
        if ("picture".equalsIgnoreCase(type)) {
            realPath = PropertiesTool.PICTURE_PATH;
        }

        try {
            // 如果文件夹不存在，则创建文件夹
            if (realPath != null) {
                File f = new File(realPath);
                if (!f.exists()) {
                    boolean b = f.mkdirs();
                }
                // 遍历数组，取出批量上传的文件
                for (MultipartFile myfile : Filedata) {
                    String fileName = myfile.getOriginalFilename();
                    String uniqueFileName = changeFileNameToUniqueName(myfile.getOriginalFilename());
                    File file = new File(realPath, uniqueFileName);
                    FileUtils.copyInputStreamToFile(myfile.getInputStream(), file);

                    // 将上传成功的文件添加至链表
                    uploadFileList.add(new UploadFile(fileName, realPath + "/" + uniqueFileName));
                }
                resultMessage.setSuccess(true);
            }
        } catch (Exception e) {
            resultMessage.setMsg(e.getMessage());
        }
        resultMessage.setObj(uploadFileList);
        try {
            response.setContentType("application/json; charset=UTF-8");
            response.getWriter().print(JSON.toJSON(resultMessage));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    /**
     * 获取唯一的文件名称
     */
    private String changeFileNameToUniqueName(String oldName) {
        return UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf('.'), oldName.length());
    }
}
