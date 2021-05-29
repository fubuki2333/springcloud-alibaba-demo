package com.chenyu.springcloud.alibaba.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:ApplicationContextConfig
 * Package:com.chenyu.springcloud.alibaba.config
 * Description:
 *
 * @Date:2021/5/23 16:44
 * @Author:gaochenyu2012@126.com
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
