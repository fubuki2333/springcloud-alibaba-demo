package com.chenyu.springcloud.alibaba.service;

import com.chenyu.springcloud.alibaba.domain.Order;

/**
 * InterfaceName: OrderService
 * Package: com.chenyu.springcloud.alibaba.service
 * Description:
 *
 * @Date: 2021/9/2 下午 10:25
 * @Author: gaochenyu2012@126.com
 */
public interface OrderService {
    void create(Order order);
}
