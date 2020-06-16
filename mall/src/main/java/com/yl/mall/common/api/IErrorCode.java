package com.yl.mall.common.api;

/**
 * @version: 1.00.00
 * @description:封装API的错误码
 * @copyright: Copyright (c) 2019  All Rights Reserved
 * @company:
 * @author: yl
 * @date: 2020/6/12 16:09
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
