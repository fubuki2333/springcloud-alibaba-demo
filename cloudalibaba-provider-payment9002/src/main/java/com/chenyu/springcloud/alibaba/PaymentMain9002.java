package com.chenyu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName:PaymentMain9002
 * Package:com.chenyu.springcloud.alibaba
 * Description:
 *
 * @Date:2021/5/23 16:11
 * @Author:gaochenyu2012@126.com
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9002.class, args);
    }
}
