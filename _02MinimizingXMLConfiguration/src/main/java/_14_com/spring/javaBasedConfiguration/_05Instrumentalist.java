package _14_com.spring.javaBasedConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class _05Instrumentalist implements _01Performer {

	private _02Instrument instrument;

	@Value("${song}")
	private String song;

	private _03Poem poem;

	public _05Instrumentalist() {
		super();
	}

	public void setInstrument(_02Instrument instrument) {
		this.instrument = instrument;
	}

	public void setPoem(_03Poem poem) {
		this.poem = poem;
	}

	public void perform() {
		System.out.println("Song is " + song);
		instrument.play();
		poem.recite();
	}

}
