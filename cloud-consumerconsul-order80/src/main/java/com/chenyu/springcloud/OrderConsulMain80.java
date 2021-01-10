package com.chenyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName:OrderConsulMain80
 * Package:com.chenyu.springcloud
 * Description:
 *
 * @Date:2021/1/10 14:58
 * @Author:gaochenyu2012@126.com
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain80.class, args);
    }
}
