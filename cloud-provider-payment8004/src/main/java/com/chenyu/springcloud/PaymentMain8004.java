package com.chenyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName:PaymentMain8004
 * Package:com.chenyu.springcloud
 * Description:
 *
 * @Date:2021/1/9 16:45
 * @Author:gaochenyu2012@126.com
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
