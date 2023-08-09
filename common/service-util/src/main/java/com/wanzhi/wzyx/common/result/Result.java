package com.wanzhi.wzyx.common.result;

import lombok.Data;

/**
 * 统一返回结果类
 *
 * @author :Yangyang Miao
 * @date :2023-08-08 23:47:00
 */
@Data
public class Result<T> {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 信息
     */
    private String message;

    /**
     * 数据
     */
    private T data;

    /**
     * 构造私有化，别人不能new，在类中提供一些静态方法给别人设置状态码
     */
    private Result() {

    }

    /**
     * 外部可调用，设置数据，返回对象的方法
     */
    public static <T> Result<T> build(T data, ResultCodeEnum resultCodeEnum) {
        Result<T> result = new Result<>();
        // 设置data
        if (data != null) {
            result.setData(data);
        }
        // 设置其他值
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        // 返回设置值之后的对象
        return result;
    }

    // 成功
    public static <T> Result<T> ok(T data) {
        return build(data, ResultCodeEnum.SUCCESS);
    }

    // 失败
    public static <T> Result<T> fail(T data) {
        return build(data, ResultCodeEnum.FAIL);
    }
}
