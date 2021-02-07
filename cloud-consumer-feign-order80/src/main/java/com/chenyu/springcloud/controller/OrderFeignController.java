package com.chenyu.springcloud.controller;

import com.chenyu.springcloud.entities.CommonResult;
import com.chenyu.springcloud.entities.Payment;
import com.chenyu.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName:OrderFeignController
 * Package:com.chenyu.springcloud.controller
 * Description:
 *
 * @Date:2021/1/21 23:38
 * @Author:gaochenyu2012@126.com
 */
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeOut(){
        //openfeign-ribbon，客户端一般默认等待1秒种
        return paymentFeignService.paymentFeignTimeOut();
    }
}
