package com.chenyu.springcloud.alibaba.service;

import com.chenyu.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * InterfaceName: AccountService
 * Package: com.chenyu.springcloud.alibaba.service
 * Description:
 *
 * @Date: 2021/9/2 下午 10:28
 * @Author: gaochenyu2012@126.com
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
