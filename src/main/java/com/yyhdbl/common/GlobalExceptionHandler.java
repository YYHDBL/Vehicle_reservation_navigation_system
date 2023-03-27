package com.yyhdbl.common;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 全局异常处理
 */
@Slf4j
@ControllerAdvice(annotations = {RestController.class, Controller.class})  //打上这些注解的类都要进行异常处理
@ResponseBody //将返回的数据自动转成json数据
public class GlobalExceptionHandler {
    /**
     * 异常处理方法
     * 拦截sql异常
     *
     * @return
     */
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public R<String> exceptionHandler(SQLIntegrityConstraintViolationException ex) {

        log.error(ex.getMessage());
        //拦截账号已存在的异常
        if (ex.getMessage().contains("Duplicate entry")) {
            String[] split = ex.getMessage().split(" ");
            String msg = "账号"+split[2] + "已存在";
            return R.error(msg);
        }

        return R.error("未知错误");
    }


    /**
     * 异常处理方法
     * 捕获自定义异常
     *
     * @return
     */
    @ExceptionHandler(CustomException.class)
    public R<String> exceptionHandler(CustomException ex) {

        log.error(ex.getMessage());
        return R.error(ex.getMessage());
    }

}
