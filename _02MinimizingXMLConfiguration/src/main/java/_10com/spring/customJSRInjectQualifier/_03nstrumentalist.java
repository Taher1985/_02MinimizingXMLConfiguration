package _10com.spring.customJSRInjectQualifier;

import javax.inject.Inject;

public class _03nstrumentalist implements _01Performer {

	@Inject
	@StringnedInstrument
	@Strummed
	private _02Instrument instrument;


	public void perform() {
		instrument.play();
	}

}
