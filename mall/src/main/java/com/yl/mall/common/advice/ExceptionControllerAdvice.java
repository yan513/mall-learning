package com.yl.mall.common.advice;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yl.mall.common.api.CommonResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @version: 1.0.0
 * @description:异常捕获处理
 * @copyright: Copyright (c) 2020 All Rights Reserved
 * @author: yanlin
 * @date: 2020/6/15 1:24 下午
 */
@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public CommonResult<String> MethodArgumentNotValidExceptionHandle(MethodArgumentNotValidException e) {
        ObjectError error = e.getBindingResult().getFieldErrors().get(0);
        return CommonResult.validateFailed(error.getDefaultMessage());
    }

}
