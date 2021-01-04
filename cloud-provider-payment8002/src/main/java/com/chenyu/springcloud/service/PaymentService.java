package com.chenyu.springcloud.service;

import com.chenyu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * InterfaceName:PaymentService
 * Package:com.chenyu.springcloud.service
 * Description:
 *
 * @Date:2020/12/20 20:36
 * @Author:gaochenyu2012@126.com
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
