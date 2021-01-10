package com.chenyu.springcloud.controller;

import com.chenyu.springcloud.OrderConsulMain80;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * ClassName:OrderConsulController
 * Package:com.chenyu.springcloud.controller
 * Description:
 *
 * @Date:2021/1/10 15:00
 * @Author:gaochenyu2012@126.com
 */
@RestController
public class OrderConsulController {
    public static final String INVOKE_URL = "http://cloud-provider-payment";
    private final Logger logger = LoggerFactory.getLogger(OrderConsulController.class);

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return result;
    }
}
