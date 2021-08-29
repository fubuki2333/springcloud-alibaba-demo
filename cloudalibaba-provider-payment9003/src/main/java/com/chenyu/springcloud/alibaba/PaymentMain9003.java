package com.chenyu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName:PaymentMain9003
 * Package:com.chenyu.springcloud.alibaba
 * Description:
 *
 * @Date:2021/8/28 下午 5:34
 * @Author:gaochenyu2020@163.com
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9003 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9003.class, args);
    }
}
