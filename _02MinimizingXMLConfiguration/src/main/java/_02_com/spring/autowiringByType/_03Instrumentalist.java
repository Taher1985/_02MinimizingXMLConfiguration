package _02_com.spring.autowiringByType;

public class _03Instrumentalist implements _01Performer {

	private _02Instrument instrument;

	public void setInstrument(_02Instrument instrument) {
		this.instrument = instrument;
	}

	public void perform() {
		instrument.play();
	}

}
