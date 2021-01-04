package com.chenyu.springcloud.service.impl;

import com.chenyu.springcloud.dao.PaymentDao;
import com.chenyu.springcloud.entities.Payment;
import com.chenyu.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName:PaymentServiceImpl
 * Package:com.chenyu.springcloud.service.impl
 * Description:
 *
 * @Date:2020/12/20 20:37
 * @Author:gaochenyu2012@126.com
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(@Param("id")Long id){
        return paymentDao.getPaymentById(id);
    }
}
