package com.chenyu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName:OrderNacosMain83
 * Package:com.chenyu.springcloud.alibaba
 * Description:
 *
 * @Date:2021/5/23 16:43
 * @Author:gaochenyu2012@126.com
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain83 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain83.class, args);
    }
}
