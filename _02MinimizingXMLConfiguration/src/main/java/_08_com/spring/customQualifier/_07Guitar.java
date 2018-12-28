package _08_com.spring.customQualifier;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier(value="guitarQualifier")
public class _07Guitar implements _02Instrument {

	@Override
	public void play() {
		System.out.println("TING TING TIDING $$$");
	}

}
