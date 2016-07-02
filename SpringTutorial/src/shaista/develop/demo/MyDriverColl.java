package shaista.develop.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDriverColl {
	public static void main(String[] args){
		ApplicationContext appCon = new ClassPathXmlApplicationContext("BeanS2.xml");
		CollectionJava cj = (CollectionJava) appCon.getBean("collectionData");
		cj.getAddressList();
		cj.getAddressSet();
		cj.getAddressMap();
		cj.getAddressProp();
	}
}
