package com.chenyu.springcloud.service;

import com.chenyu.springcloud.entities.CommonResult;
import com.chenyu.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * InterfaceName:PaymentFeignService
 * Package:com.chenyu.springcloud.service
 * Description:
 *
 * @Date:2021/1/21 23:32
 * @Author:gaochenyu2012@126.com
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeOut();
}
