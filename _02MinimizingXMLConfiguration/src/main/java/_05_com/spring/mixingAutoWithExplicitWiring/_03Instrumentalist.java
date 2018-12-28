package _05_com.spring.mixingAutoWithExplicitWiring;

public class _03Instrumentalist implements _01Performer {

	private String song;
	private _02Instrument instrument1;
	private _02Instrument instrument2;

	public void setSong(String song) {
		this.song = song;
	}

	public void setInstrument1(_02Instrument instrument1) {
		this.instrument1 = instrument1;
	}

	public void setInstrument2(_02Instrument instrument2) {
		this.instrument2 = instrument2;
	}

	public void perform() {
		System.out.println("Song is " + song);
		instrument1.play();
		instrument2.play();
	}

}
