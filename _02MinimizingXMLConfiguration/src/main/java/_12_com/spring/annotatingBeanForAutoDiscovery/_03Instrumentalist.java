package _12_com.spring.annotatingBeanForAutoDiscovery;

import org.springframework.stereotype.Controller;

@Controller
public class _03Instrumentalist implements _01Performer {

	private _02Instrument instrument;

	public void perform() {
		instrument.play();
	}

}
