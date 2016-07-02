package event.handling.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventDriver {

	public static void main(String[] args) {	
		ConfigurableApplicationContext appCon = new ClassPathXmlApplicationContext("BeansEvents.xml");
		appCon.start();
		
		HelloWorld hw = (HelloWorld) appCon.getBean("world");
		hw.getMessage();
		
		appCon.stop();
		appCon.close();
	}

}
