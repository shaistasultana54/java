package event.handling.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class HelloClose implements ApplicationListener<ContextClosedEvent> {

	@Override
	public void onApplicationEvent(ContextClosedEvent arg0) {
		System.out.println("Bye Bye");
		// TODO Auto-generated method stub
		
	}

}
