package com.chenyu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * ClassName:PaymentFallbackService
 * Package:com.chenyu.springcloud.service
 * Description:
 *
 * @Date:2021/1/31 23:14
 * @Author:gaochenyu2012@126.com
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_OK, T_T";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------PaymentFallbackService fall back-paymentInfo_TimeOut, T_T";
    }
}
