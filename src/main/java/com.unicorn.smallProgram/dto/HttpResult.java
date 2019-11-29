package com.unicorn.smallProgram.dto;

/**
 * http请求返回数据格式
 * @param <T>
 */
public  class HttpResult<T> {

    private int httpCode;

    private String msg;

    private T data;

    public HttpResult(int httpCode, String msg, T data) {
        this.httpCode = httpCode;
        this.msg = msg;
        this.data = data;
    }

    public HttpResult(int httpCode, String msg) {
        this.httpCode = httpCode;
        this.msg = msg;
    }

    public HttpResult() {
    }

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
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
