package com.xuwb.librarysystem.dto;

public class GeneralResponse<T> {
    private Integer code = 200;
    private String msg = "success";
    private T data;

    public GeneralResponse(T data) {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
