package _14_com.spring.javaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _11Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_14applicationcontainerbeans.xml");

		_01Performer performerI = (_01Performer) context.getBean("instrumentalist");
		performerI.perform();
		
		System.out.println();
		
		_01Performer performerP = (_01Performer) context.getBean("poeticInstrumentalist");
		performerP.perform();
	}

}
