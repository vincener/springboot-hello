package com.wcx.springboothello.rabbit.object;

import com.wcx.springboothello.entity.GoodsEntity;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ObjectSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send(GoodsEntity goods) {
		System.out.println("Sender object: " + goods.toString());
		this.rabbitTemplate.convertAndSend("object", goods);
	}

}