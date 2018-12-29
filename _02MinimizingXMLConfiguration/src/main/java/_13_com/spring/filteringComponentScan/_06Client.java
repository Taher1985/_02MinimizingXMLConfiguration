package _13_com.spring.filteringComponentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _06Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_13applicationcontainerbeans.xml");

		_01Performer performer = (_01Performer) context.getBean("_03Instrumentalist");
		performer.perform();
	}

}
