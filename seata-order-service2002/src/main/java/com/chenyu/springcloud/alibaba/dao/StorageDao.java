package com.chenyu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: StorageDao
 * Package: com.george.springcloud.alibaba.dao
 * Description:
 *
 * @Date: 2021/9/4 上午 11:49
 * @Author: gaochenyu2012@126.com
 */
@Mapper
public interface StorageDao {
    int decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
