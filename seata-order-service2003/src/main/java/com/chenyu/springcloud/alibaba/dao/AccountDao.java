package com.chenyu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * ClassName: AccountDao
 * Package: com.chenyu.springcloud.alibaba.dao
 * Description:
 *
 * @Date: 2021/9/4 下午 8:55
 * @Author: gaochenyu2012@126.com
 */
@Mapper
public interface AccountDao {
    /**
     * 扣减账户余额
     *
     * @param userId
     * @param money
     * @return
     */
    int decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
