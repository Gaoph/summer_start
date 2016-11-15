package com.myblog.common.entity;

/**
 * 上传文件的实体类
 * Created by gaoph on 2016/11/15.
 */
public class UploadFile extends BaseEntity {
    /**
     * 文件原始名称
     */
    private String fileName;
    /**
     * 文件保存路径
     */
    private String filePath;

    public UploadFile(String fileName, String filePath) {
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public UploadFile() {
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
