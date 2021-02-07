package com.chenyu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:FeignConfig
 * Package:com.chenyu.springcloud.config
 * Description:
 *
 * @Date:2021/1/24 20:58
 * @Author:gaochenyu2012@126.com
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
