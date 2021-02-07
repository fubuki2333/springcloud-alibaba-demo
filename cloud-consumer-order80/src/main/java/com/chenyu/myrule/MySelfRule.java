package com.chenyu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:MySelfRule
 * Package:com.chenyu.myrule
 * Description:
 *
 * @Date:2021/1/10 23:01
 * @Author:gaochenyu2012@126.com
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule(); // 定义为随机
    }
}
