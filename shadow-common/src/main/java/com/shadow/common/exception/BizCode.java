package com.shadow.common.exception;

public enum  BizCode {


    UNKNOW_EXCEPTION(10000,"系统未知异常"),
    VALID_EXCEPTION(100001,"参数格式校验失败")

    ;

    private int code;
    private String message;

    BizCode(int code ,String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
