package com.yl.mall.common.api;

/**
 * @version: 1.00.00
 * @description:封装API的错误码
 * @copyright: Copyright (c) 2019 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: yanlin
 * @date: 2020/6/12 16:09
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
