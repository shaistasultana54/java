package shaista.develop.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDriverDI {
	public static void main(String[] args){
		ApplicationContext appCon = new ClassPathXmlApplicationContext("BeanS1.xml");
		TextEditorSI te = (TextEditorSI) appCon.getBean("textEditor");// typecast it for the type that u want, id is inside the inverted commas
		te.spellCheck();
	}
}
