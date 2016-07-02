package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PreAdvisorDriver {

	public static void main(String[] args) {
		ConfigurableApplicationContext appCon= new ClassPathXmlApplicationContext("BeansAOP.xml");
		Country ser = (Country) appCon.getBean("ProxyFactory");
		ser.getCountryName();
		ser.getCountryCapital();
		// TODO Auto-generated method stub

	}

}
