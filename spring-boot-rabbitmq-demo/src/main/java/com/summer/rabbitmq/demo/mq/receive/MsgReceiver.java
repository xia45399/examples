package com.summer.rabbitmq.demo.mq.receive;

import com.summer.rabbitmq.demo.mq.msg.MqMsg;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "testQueue")
public class MsgReceiver {

    @RabbitHandler
    public void process(MqMsg msg) {
        System.out.println("Receiver  : " + msg);
    }
}
