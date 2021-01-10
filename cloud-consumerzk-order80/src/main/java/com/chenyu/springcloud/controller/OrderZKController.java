package com.chenyu.springcloud.controller;

import com.chenyu.springcloud.OrderZKMain80;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * ClassName:OrderZKController
 * Package:com.chenyu.springcloud.controller
 * Description:
 *
 * @Date:2021/1/9 21:58
 * @Author:gaochenyu2012@126.com
 */
@RestController
public class OrderZKController {

    public static final String INVOKE_URL = "http://cloud-provider-payment";
    private final Logger logger = LoggerFactory.getLogger(OrderZKMain80.class);

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
        return result;
    }
}
