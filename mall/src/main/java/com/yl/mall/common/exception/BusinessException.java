package com.yl.mall.common.exception;

/**
 * @version: 1.0.0
 * @description: 异常
 * @copyright: Copyright (c) 2020 All Rights Reserved
 * @author: yl
 * @date: 2020/6/16 1:30 下午
 */

public class BusinessException extends RuntimeException{
    /**
     * 异常代码
     */
    private int code;

    /**
     * 异常信息
     */
    private String message;

    private BusinessException(String message) {super(message);}

    public BusinessException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
