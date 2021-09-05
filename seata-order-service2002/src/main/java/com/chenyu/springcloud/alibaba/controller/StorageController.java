package com.chenyu.springcloud.alibaba.controller;

import com.chenyu.springcloud.alibaba.service.StorageService;
import com.chenyu.springcloud.alibaba.domain.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * ClassName: StorageController
 * Package: com.george.springcloud.alibaba.controller
 * Description:
 *
 * @Date: 2021/9/4 下午 4:22
 * @Author: gaochenyu2012@126.com
 */
public class StorageController {
    @Resource
    private StorageService storageService;

    @RequestMapping(value = "/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200, "扣减库存成功");
    }
}
