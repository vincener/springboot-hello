package com.wcx.springboothello;

import com.wcx.springboothello.entity.GoodsEntity;
import com.wcx.springboothello.rabbit.object.ObjectSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObjectTest {

	@Autowired
	private ObjectSender sender;

	@Test
	public void sendOject() throws Exception {
		GoodsEntity user=new GoodsEntity();
		user.setName("neo");
		user.setIntro("123456");
		sender.send(user);
	}

}