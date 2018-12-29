package _08_com.spring.customQualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class _03Instrumentalist implements _01Performer {

	@Autowired
	@StringnedInstrument
	@Strummed
	private _02Instrument instrument;


	public void perform() {
		instrument.play();
	}

}
