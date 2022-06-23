package com.iefei.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public R doException(Exception e){
        e.printStackTrace();
        return new R(false,"服务器故障");
    }
}
