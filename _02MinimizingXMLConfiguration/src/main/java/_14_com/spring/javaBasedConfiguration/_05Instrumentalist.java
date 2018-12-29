package _14_com.spring.javaBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class _05Instrumentalist implements _01Performer {

	@Autowired
	@Qualifier("drum")
	private _02Instrument instrument;

	@Value("${song}")
	private String song;
	
	@Autowired
	@Qualifier("tonnet")
	private _03Poem poem;
	
	public _05Instrumentalist() {
		super();
	}

	public _05Instrumentalist(_02Instrument instrument, String song) {
		super();
		this.instrument = instrument;
		this.song = song;
	}


	public void perform() {
		System.out.println("Song is " + song);
		instrument.play();
		poem.recite();
	}

}
