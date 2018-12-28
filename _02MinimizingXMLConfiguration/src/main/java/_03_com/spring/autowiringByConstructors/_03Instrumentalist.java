package _03_com.spring.autowiringByConstructors;

public class _03Instrumentalist implements _01Performer {

	private String song;
	private _02Instrument instrument;

	public _03Instrumentalist(_02Instrument instrument) {
		super();
		System.out.println("0");
		this.instrument = instrument;
	}
	
	public _03Instrumentalist(String song, _02Instrument instrument) {
		super();
		System.out.println("1");
		this.song = song;
		this.instrument = instrument;
	}
	
	public _03Instrumentalist(_02Instrument instrument, String song) {
		super();
		System.out.println("2");
		this.song = song;
		this.instrument = instrument;
	}
	
	public void perform() {
		System.out.println("Song is " + song);
		instrument.play();
	}

}
