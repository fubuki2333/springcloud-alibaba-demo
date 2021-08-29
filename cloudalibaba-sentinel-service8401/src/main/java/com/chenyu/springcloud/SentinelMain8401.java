package com.chenyu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName:SentinelMain8401
 * Package:com.chenyu.springcloud
 * Description:
 *
 * @Date:2021/8/15 下午 3:04
 * @Author:gaochenyu2020@163.com
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelMain8401 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelMain8401.class, args);
    }
}
