package com.chenyu.springcloud.alibaba.service;

import com.chenyu.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * InterfaceName: StorageService
 * Package: com.chenyu.springcloud.alibaba.service
 * Description:
 *
 * @Date: 2021/9/2 下午 10:29
 * @Author: gaochenyu2012@126.com
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
