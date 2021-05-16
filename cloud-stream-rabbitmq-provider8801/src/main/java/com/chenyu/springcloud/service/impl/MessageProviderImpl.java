package com.chenyu.springcloud.service.impl;

import com.chenyu.springcloud.service.IMessageProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * ClassName:MessageProviderImpl
 * Package:com.chenyu.springcloud.service.impl
 * Description:
 *
 * @Date:2021/5/16 22:14
 * @Author:gaochenyu2012@126.com
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    private final Logger logger = LoggerFactory.getLogger(MessageProviderImpl.class);

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        logger.info("生产者发送消息 ------> [{}]", serial);
        return null;
    }
}
