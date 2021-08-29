package com.chenyu.springcloud.alibaba.service;

import com.chenyu.springcloud.entities.CommonResult;
import com.chenyu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ClassName: PaymentService
 * Package: com.chenyu.springcloud.alibaba.service
 * Description:
 *
 * @Date: 2021/8/29 下午 8:52
 * @Author: gaochenyu2012@126.com
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackServiceImpl.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> PaymentSQL(@PathVariable("id") Long id);
}
