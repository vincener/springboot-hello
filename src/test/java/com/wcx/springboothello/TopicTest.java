package com.wcx.springboothello;

import com.wcx.springboothello.rabbit.topic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicTest {

	@Autowired
	private TopicSender sender;

	@Test
	public void topic() throws Exception {
		sender.send();
	}

	@Test
	public void topic1() throws Exception {
		sender.send1();
	}

	@Test
	public void topic2() throws Exception {
		sender.send2();
	}
	@Test
	public void topic3() throws Exception {
		for (int i = 0; i <10 ; i++) {
			sender.send3(i);
		}

	}

}