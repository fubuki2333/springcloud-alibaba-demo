package com.chenyu.springcloud.alibaba.service.impl;

import com.chenyu.springcloud.alibaba.dao.AccountDao;
import com.chenyu.springcloud.alibaba.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * ClassName: AccountServiceImpl
 * Package: com.chenyu.springcloud.alibaba.service.impl
 * Description:
 *
 * @Date: 2021/9/4 下午 8:54
 * @Author: gaochenyu2012@126.com
 */
@Service
public class AccountServiceImpl implements AccountService {

    private Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("------------->account-service 中扣减库存开始");
        //  模拟异常 配合 2001 服务里面的注解    @GlobalTransactional(name = "fsp-create-order", rollbackFor = Exception.class)
        //  导致结果,订单状态没变成已完成,库存和账户都被扣减
        //  正常测试注销try catch.
//        try {
//            TimeUnit.SECONDS.sleep(20);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        accountDao.decrease(userId, money);
        log.info("------------->account-service 中扣减库存结束");
    }
}
