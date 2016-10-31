package com.myblog.entity;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private Integer articleId;

    private String articleContent;

    private String articleWriter;

    private Date articleCreateAt;

    private static final long serialVersionUID = 1L;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    public String getArticleWriter() {
        return articleWriter;
    }

    public void setArticleWriter(String articleWriter) {
        this.articleWriter = articleWriter == null ? null : articleWriter.trim();
    }

    public Date getArticleCreateAt() {
        return articleCreateAt;
    }

    public void setArticleCreateAt(Date articleCreateAt) {
        this.articleCreateAt = articleCreateAt;
    }
}