package com.chenyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName:OrderZKMain80
 * Package:com.chenyu.springcloud
 * Description:
 *
 * @Date:2021/1/9 21:51
 * @Author:gaochenyu2012@126.com
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain80.class, args);
    }
}
