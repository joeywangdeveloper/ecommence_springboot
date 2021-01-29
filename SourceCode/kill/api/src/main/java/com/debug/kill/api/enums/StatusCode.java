package com.debug.kill.api.enums;

/**
 * 通用状态码
 */
public enum StatusCode {

    Success(0,"success"),
    Fail(-1,"fail"),
    InvalidParams(201,"invalid!"),
    UserNotLogin(202,"user not login"),

    ;

    private Integer code;
    private String msg;

    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
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
}
