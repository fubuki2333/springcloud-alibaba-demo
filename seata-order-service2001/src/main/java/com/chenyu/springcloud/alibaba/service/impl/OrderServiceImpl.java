package com.chenyu.springcloud.alibaba.service.impl;

import com.chenyu.springcloud.alibaba.dao.OrderDao;
import com.chenyu.springcloud.alibaba.domain.Order;
import com.chenyu.springcloud.alibaba.service.AccountService;
import com.chenyu.springcloud.alibaba.service.OrderService;
import com.chenyu.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName: OrderServiceImpl
 * Package: com.chenyu.springcloud.alibaba.service
 * Description:
 *
 * @Date: 2021/9/2 下午 10:27
 * @Author: gaochenyu2012@126.com
 */
@Service
public class OrderServiceImpl implements OrderService {

    private Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Resource
    private OrderDao orderDao;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;

    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * 简单来说,下订单->减库存->减账户余额->改状态
     *
     * @param order
     */
    @Override
    @GlobalTransactional(name = "fsp-create-order", rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("------------->开始新建订单");
        orderDao.create(order);

        log.info("------------->订单微服务开始调用库存,做扣减 数量");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("------------->订单微服务开始调用库存,做扣减end");

        log.info("------------->订单微服务开始调用账户,做扣减 账户余额");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("------------->订单微服务开始调用账户,做扣减end");

        log.info("------------->修改订单状态开始");
        orderDao.update(order.getUserId(), 0);
        log.info("------------->修改订单状态结束");

        log.info("------------->下订单结束了,O(∩_∩)O哈哈~");
    }
}
