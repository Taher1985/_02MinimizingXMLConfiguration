package _14_com.spring.javaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _07Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_14applicationcontainerbeans.xml");

		_01Performer performer = (_01Performer) context.getBean("instrumentalist");
		performer.perform();
	}

}
