package shaista.develop.demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args){
		AbstractApplicationContext appCon = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld hw = (HelloWorld) appCon.getBean("helloWorld");
		
//		hw.setMessage("India");
		hw.getMessage();
		appCon.registerShutdownHook();
		
//		HelloWorld hwa = (HelloWorld) appCon.getBean("helloWorld");
//		hwa.getMessage();  //select and ctrl / for commenting
	}
}
