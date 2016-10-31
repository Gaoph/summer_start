package com.myblog.common.entity;

/**
 * 返回结果的实体类
 * Created by gaoph on 2016/10/31.
 */
public class ResultMessage {
    /**
     * 是否成功
     */
    private boolean success = false;
    /**
     * 附加信息
     */
    private String msg;
    /**
     * 附带对象
     */
    private Object obj;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
