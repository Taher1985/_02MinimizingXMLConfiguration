package _01_com.spring.autowiringByName;

public class _03Instrumentalist implements _01Performer {

	private _02Instrument instrument;

	public void setInstrument(_02Instrument instrument) {
		this.instrument = instrument;
	}

	public void perform() {
		instrument.play();
	}

}
