package com.chenyu.springcloud.alibaba.service;

import java.math.BigDecimal;

/**
 * ClassName: AccountService
 * Package: com.chenyu.springcloud.alibaba.service
 * Description:
 *
 * @Date: 2021/9/4 下午 8:53
 * @Author: gaochenyu2012@126.com
 */
public interface AccountService {
    /**
     * 扣减账户余额
     *
     * @param userId
     * @param money
     */
    void decrease(Long userId, BigDecimal money);
}
