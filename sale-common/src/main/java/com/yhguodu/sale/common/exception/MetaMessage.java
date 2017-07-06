package com.yhguodu.sale.common.exception;

public enum MetaMessage {
    USER_NOT_FOUND(400001,"用户不存在"),
    USER_GET_INFO_ERROR(400002,"获取用户信息出错");


    private int code;
    private String message;

    MetaMessage(int code, String message) {
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
