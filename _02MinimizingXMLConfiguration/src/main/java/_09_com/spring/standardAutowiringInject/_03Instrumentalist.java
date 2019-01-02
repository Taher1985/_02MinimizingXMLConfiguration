package _09_com.spring.standardAutowiringInject;

import javax.inject.Inject;
import javax.inject.Named;

public class _03Instrumentalist implements _01Performer {

	@Inject
	@Named(value="drum")
	private _02Instrument instrument;

	public void perform() {
		instrument.play();
	}

}
