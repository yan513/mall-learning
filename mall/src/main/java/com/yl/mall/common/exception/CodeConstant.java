package com.yl.mall.common.exception;

/**
 * @version: 1.0.0
 * @description: 状态码
 * @copyright: Copyright (c) 2020 All Rights Reserved
 * @author: yl
 * @date: 2020/6/16 1:35 下午
 */
public final class CodeConstant {
    public static final class Http {
        /**
         * 成功
         */
        public static final Integer SUCCESS = 200;

        /**
         * 暂未登录或token已经过期
         */
        public static final Integer UNAUTHORIZED = 401;

        /**
         * 没有权限
         */
        public static final Integer FORBIDDEN = 402;

        /**
         * 参数校验错误
         */
        public static final Integer VALIDATE_FAILED = 403;

        /**
         * 执行失败
         */
        public static final Integer EXECUTE_FAIL = 403;
    }
}
