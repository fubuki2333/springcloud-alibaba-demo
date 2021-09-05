package com.chenyu.springcloud.alibaba.dao;

import com.chenyu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: OrderDao
 * Package: com.chenyu.springcloud.alibaba.dao
 * Description:
 *
 * @Date: 2021/9/2 下午 9:39
 * @Author: gaochenyu2012@126.com
 */
@Mapper
public interface OrderDao {

    /**
     * 创建订单
     *
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单状态
     *
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}

