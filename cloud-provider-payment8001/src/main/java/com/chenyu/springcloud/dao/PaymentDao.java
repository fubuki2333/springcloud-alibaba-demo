package com.chenyu.springcloud.dao;

import com.chenyu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * InterfaceName:PaymentDao
 * Package:com.chenyu.springcloud.dao
 * Description:
 *
 * @Date:2020/12/20 20:07
 * @Author:gaochenyu2012@126.com
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
