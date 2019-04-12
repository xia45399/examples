package com.summer.rabbitmq.demo.controller;

import com.summer.rabbitmq.demo.mq.MqUtils;
import com.summer.rabbitmq.demo.mq.msg.MqMsg;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoController {
    @Resource
    private MqUtils mqUtils;

    @RequestMapping("/mq/send")
    public void send() {
        MqMsg mqMsg = new MqMsg();
        mqMsg.setUserName("哈哈");
        mqMsg.setTime(System.currentTimeMillis());
        mqUtils.sendMsg(mqMsg);
    }

    @RequestMapping("/mq/receive")
    public void receive() {
        mqUtils.receiveMsg();
    }
}
