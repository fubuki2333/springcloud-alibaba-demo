package com.chenyu.springcloud.alibaba.service;

import com.chenyu.springcloud.entities.CommonResult;
import com.chenyu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

/**
 * ClassName: PaymentFallbackServiceImpl
 * Package: com.chenyu.springcloud.alibaba.service
 * Description:
 *
 * @Date: 2021/8/29 下午 8:52
 * @Author: gaochenyu2012@126.com
 */
@Service
public class PaymentFallbackServiceImpl implements PaymentService {
    @Override
    public CommonResult<Payment> PaymentSQL(Long id) {
        return new CommonResult<>(444444444, "服务降级返回，----PaymentFallbackServiceImpl", new Payment(id, "errorSerial"));
    }
}
