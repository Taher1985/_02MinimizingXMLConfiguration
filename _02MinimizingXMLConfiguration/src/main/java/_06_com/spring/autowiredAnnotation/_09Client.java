package _06_com.spring.autowiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _09Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/_06applicationcontainerbeans.xml");

		_01Performer performer = (_01Performer) context.getBean("performer");
		performer.perform();
	}

}
