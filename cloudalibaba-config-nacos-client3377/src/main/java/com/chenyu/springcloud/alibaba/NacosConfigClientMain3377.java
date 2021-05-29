package com.chenyu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName:NacosConfigClientMain3377
 * Package:com.chenyu.springcloud.alibaba
 * Description:
 *
 * @Date:2021/5/23 21:01
 * @Author:gaochenyu2012@126.com
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3377.class, args);
    }
}
