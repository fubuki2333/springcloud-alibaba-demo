package com.chenyu.springcloud.alibaba.controller;

import com.chenyu.springcloud.alibaba.domain.CommonResult;
import com.chenyu.springcloud.alibaba.domain.Order;
import com.chenyu.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName: OrderController
 * Package: com.chenyu.springcloud.alibaba.controller
 * Description:
 *
 * @Date: 2021/9/4 上午 10:47
 * @Author: gaochenyu2012@126.com
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    /**
     * 测试链接
     * http://localhost:2001/order/create?userId=1&productId=1&count=10&money=100
     *
     * @param order
     * @return
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建完成", order);
    }
}
