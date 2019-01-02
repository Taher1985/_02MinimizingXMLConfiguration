package _05_com.spring.mixingAutoWithExplicitWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _06Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_05applicationcontainerbeans.xml");

		_01Performer performer = (_01Performer) context.getBean("performer");
		performer.perform();

	}

}
