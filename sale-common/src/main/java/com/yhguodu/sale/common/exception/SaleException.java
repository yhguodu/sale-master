package com.yhguodu.sale.common.exception;


public class SaleException extends RuntimeException{
    private final int code;
    private final String message;
    private Throwable throwable;

    public SaleException(int code, String message,Throwable throwable) {
        super(throwable);
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
