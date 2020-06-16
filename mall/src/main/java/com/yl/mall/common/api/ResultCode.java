package com.yl.mall.common.api;

/**
 * @version: 1.00.00
 * @description:枚举了一些常用API操作码
 * @copyright: Copyright (c) 2019  All Rights Reserved
 * @company:
 * @author: yl
 * @date: 2020/6/12 16:09
 */
public enum ResultCode implements IErrorCode {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(402, "没有相关权限"),
    VALIDATE_FAILED(403, "参数检验失败");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
