package com.xuwb.librarysystem.dto;

public class GeneralResponse<T> {
    private String message="success";
    private T data;

    public GeneralResponse(T data) {
        this.data = data;
    }

    public GeneralResponse(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
