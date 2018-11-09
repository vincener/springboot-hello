package com.wcx.springboothello.rabbit.hello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("----------------我是收到分隔线----------------");
        System.out.println("Receiver  : " + "收到了！");
        System.out.println("Receiver  : " + hello);
    }

}
