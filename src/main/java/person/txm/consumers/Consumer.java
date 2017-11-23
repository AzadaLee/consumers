package person.txm.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues={"trans","tars","cms"})
public class Consumer {
	
	@RabbitHandler
	public void process(String body){
		System.out.println(body);
	}
}
