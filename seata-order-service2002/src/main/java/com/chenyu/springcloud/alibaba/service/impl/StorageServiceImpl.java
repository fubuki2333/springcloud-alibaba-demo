package com.chenyu.springcloud.alibaba.service.impl;

import com.chenyu.springcloud.alibaba.dao.StorageDao;
import com.chenyu.springcloud.alibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ClassName: StorageServiceImpl
 * Package: com.chenyu.springcloud.alibaba.service.impl
 * Description:
 *
 * @Date: 2021/9/4 下午 4:26
 * @Author: gaochenyu2012@126.com
 */
@Service
public class StorageServiceImpl implements StorageService {

    private Logger log = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------------->storage-service 中扣减库存开始");
        storageDao.decrease(productId, count);
        log.info("------------->storage-service 中扣减库存结束");
    }

}
