package com.chenyu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * ClassName:FlowLimitController
 * Package:com.chenyu.springcloud.controller
 * Description:
 *
 * @Date:2021/8/15 下午 3:05
 * @Author:gaochenyu2020@163.com
 */
@RestController
public class FlowLimitController {
    private final Logger logger = LoggerFactory.getLogger(FlowLimitController.class);

    @GetMapping("/testA")
    public String testA() {
        /*try {
            TimeUnit.MILLISECONDS.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "----------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        logger.info(Thread.currentThread().getName() + "\t" + "...testB");
        return "----------testB";
    }

    @GetMapping("/testD")
    public String testD() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("testD 测试RT");
//        logger.info("testD 异常比例");
//        int age = 10 / 0;
        return "------testD";
    }

    @GetMapping("/testE")
    public String testE() {
        logger.info("testE 测试异常数");
        int age = 10 / 0;
        return "------testE 测试异常数";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
        return "-------testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException exception) {
        return "----deal_testHotKey,o(╥﹏╥)o";
    }
}
