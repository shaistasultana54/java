package shaista.develop.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotatedDemo {

	public static void main(String[] args) {
		ApplicationContext appCon = new AnnotationConfigApplicationContext(TEConfig.class);
		
		TextEditorCI te = appCon.getBean(TextEditorCI.class);
		te.spellCheck();
		((ConfigurableApplicationContext) appCon).close();
	}

}
