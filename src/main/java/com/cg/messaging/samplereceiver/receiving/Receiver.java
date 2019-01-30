package com.cg.messaging.samplereceiver.receiving;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	@Bean
	public Queue queue() {
		return new Queue("HelloQ", false);
	}

	@RabbitListener(queues = "HelloQ")
	public void processMessage(String message) {
		System.out.println(message);
		
	}

}
