package com.chenyu.springcloud.alibaba.domain;

/**
 * ClassName: CommonResult
 * Package: com.chenyu.springcloud.alibaba.domain
 * Description:
 *
 * @Date: 2021/9/2 下午 9:32
 * @Author: gaochenyu2012@126.com
 */
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
