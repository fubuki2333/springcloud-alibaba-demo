package com.chenyu.springcloud.controller;

import com.chenyu.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName:SendMessageController
 * Package:com.chenyu.springcloud.controller
 * Description:
 *
 * @Date:2021/5/16 22:22
 * @Author:gaochenyu2012@126.com
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }
}
