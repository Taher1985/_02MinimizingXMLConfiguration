package _11_com.spring.usingExpressionWithAnnotationInjection;

import org.springframework.beans.factory.annotation.Value;

public class _02Instrumentalist implements _01Performer {

	@Value("DillDiyaGalla")
	private String song;

	@Value("${msg}")
	private String propertyFile;

	public void perform() {
		System.out.println("Song is " + song + " and messgae is "
				+ propertyFile);
	}

}
