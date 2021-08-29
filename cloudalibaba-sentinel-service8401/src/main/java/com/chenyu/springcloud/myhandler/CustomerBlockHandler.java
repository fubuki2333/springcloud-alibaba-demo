package com.chenyu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.chenyu.springcloud.entities.CommonResult;

/**
 * ClassName:CustomerBlockHandler
 * Package:com.chenyu.springcloud.myhandler
 * Description:
 *
 * @Date:2021/8/25 下午 10:55
 * @Author:gaochenyu2020@163.com
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客户自定义,global handlerException----------1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义2,global handlerException----------2");
    }
}
