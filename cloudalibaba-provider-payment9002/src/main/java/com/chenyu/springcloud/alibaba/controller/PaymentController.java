package com.chenyu.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:PaymentController
 * Package:com.chenyu.springcloud.alibaba.controller
 * Description:
 *
 * @Date:2021/5/23 16:12
 * @Author:gaochenyu2012@126.com
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        return "nacos registry, serverPort:" + serverPort + "\t id:" + id;
    }
}
