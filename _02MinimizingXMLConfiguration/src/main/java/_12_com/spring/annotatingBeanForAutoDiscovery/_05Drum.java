package _12_com.spring.annotatingBeanForAutoDiscovery;

import org.springframework.stereotype.Component;

@Component
public class _05Drum implements _02Instrument {

	@Override
	public void play() {
		System.out.println("DUM DAMA DUM $$$");
	}

}
