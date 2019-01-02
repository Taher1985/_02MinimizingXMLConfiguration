package _04_com.spring.defaultAutowiring;

public class _03Instrumentalist implements _01Performer {

	private String song;
	private _02Instrument instrument;

	public _03Instrumentalist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public _03Instrumentalist(String song, _02Instrument instrument) {
		super();
		this.song = song;
		this.instrument = instrument;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public void setInstrument(_02Instrument instrument) {
		this.instrument = instrument;
	}

	public void perform() {
		System.out.println("Song is " + song);
		instrument.play();
	}

}
