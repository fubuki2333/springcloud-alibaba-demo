package com.chenyu.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: MyBatisConfig
 * Package: com.chenyu.springcloud.alibaba.config
 * Description:
 *
 * @Date: 2021/9/4 上午 10:49
 * @Author: gaochenyu2012@126.com
 */
@Configuration
@MapperScan("com.chenyu.springcloud.alibaba.dao")
public class MyBatisConfig {

}
