package com.chenyu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * InterfaceName:LoadBalance
 * Package:com.chenyu.lb
 * Description:
 *
 * @Date:2021/1/17 21:08
 * @Author:gaochenyu2012@126.com
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstanceList);
}
