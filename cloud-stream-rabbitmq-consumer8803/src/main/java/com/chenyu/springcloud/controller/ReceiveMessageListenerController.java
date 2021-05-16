package com.chenyu.springcloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * ClassName:ReceiveMessageListenerController
 * Package:com.chenyu.springcloud.controller
 * Description:
 *
 * @Date:2021/5/16 22:52
 * @Author:gaochenyu2012@126.com
 */
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {

    private final Logger logger = LoggerFactory.getLogger(ReceiveMessageListenerController.class);

    @Value("${server.port}")
    private String serverPort;

    /**
     * StreamListener 注解, 监听队列, 用于消费者队列的消息接收
     *
     * @param message
     */
    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        logger.info("消费者2号 ------> 接收到的消息：[{}]; port:[{}]", message.getPayload(), serverPort);
    }
}
