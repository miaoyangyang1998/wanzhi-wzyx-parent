package com.wanzhi.wzyx.common.exception;

import com.wanzhi.wzyx.common.result.ResultCodeEnum;
import lombok.Data;

/**
 * 自定义异常处理类
 * 步骤：
 * 1. 创建自定义异常类，继承RuntimeException
 * 2. 在自定义异常类定义属性，生成对应方法
 * 3. 在全局异常类定义自定义异常类型处理方法
 * 4. 手动抛出自定义异常 throw new 自定义异常
 *
 * @author :Yangyang Miao
 * @date :2023-08-09 00:17:00
 */

@Data
public class WzyxException extends RuntimeException {

    /**
     * 异常状态码
     */
    private Integer code;

    /**
     * 通过状态码和错误消息创建异常对象
     */
    public WzyxException(String message, Integer code) {
        // 传给父类
        super(message);
        this.code = code;
    }

    /**
     * 接收枚举类型对象
     */
    public WzyxException(ResultCodeEnum resultCodeEnum) {
        // 传给父类
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "WzyxException{" + "code=" + code + ", message=" + this.getMessage() + '}';
    }
}
