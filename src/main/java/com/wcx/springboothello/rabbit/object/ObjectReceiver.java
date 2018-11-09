package com.wcx.springboothello.rabbit.object;

import com.wcx.springboothello.entity.GoodsEntity;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "object")
public class ObjectReceiver {

    @RabbitHandler
    public void process(GoodsEntity goods) {
        System.out.println("Receiver object : " + goods);
    }

}
