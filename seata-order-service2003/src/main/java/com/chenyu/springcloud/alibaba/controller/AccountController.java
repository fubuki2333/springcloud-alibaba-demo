package com.chenyu.springcloud.alibaba.controller;

import com.chenyu.springcloud.alibaba.domain.CommonResult;
import com.chenyu.springcloud.alibaba.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * ClassName: AccountController
 * Package: com.chenyu.springcloud.alibaba.controller
 * Description:
 *
 * @Date: 2021/9/4 下午 8:52
 * @Author: gaochenyu2012@126.com
 */
@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult(200, "扣减账户余额成功");
    }

}
