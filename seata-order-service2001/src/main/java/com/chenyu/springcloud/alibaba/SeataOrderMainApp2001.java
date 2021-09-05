package com.chenyu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * ClassName: SeataOrderMainApp2001
 * Package: com.chenyu.springcloud.alibaba
 * Description:
 *
 * @Date: 2021/9/4 上午 10:54
 * @Author: gaochenyu2012@126.com
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //取消数据源的自动装配,使用自己的数据源
@EnableDiscoveryClient
@EnableFeignClients
public class SeataOrderMainApp2001 {
    public static void main(String[] args) {
        SpringApplication.run(SeataOrderMainApp2001.class);
    }
}
