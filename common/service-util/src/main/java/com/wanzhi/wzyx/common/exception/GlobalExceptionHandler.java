package com.wanzhi.wzyx.common.exception;

import com.wanzhi.wzyx.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理类
 *
 * @author :Yangyang Miao
 * @date :2023-08-09 00:18:00
 */

// AOP面相切面
@ControllerAdvice
public class GlobalExceptionHandler {

    // 当出现异常，方法就会执行
    @ExceptionHandler(Exception.class)
    @ResponseBody // 将返回的Result转为JSON数据
    public <T> Result<T> error(Exception e) {
        e.printStackTrace();
        return Result.fail(null);
    }
}
