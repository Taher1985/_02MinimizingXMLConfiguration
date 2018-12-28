package _07_com.spring.autowiredQualifierAmbiguousDep;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier(value="guitarQualifier")
public class _06Guitar implements _02Instrument {

	@Override
	public void play() {
		System.out.println("TING TING TIDING $$$");
	}

}
