package _13_com.spring.filteringComponentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class _03Instrumentalist implements _01Performer {

	@Autowired
	@Qualifier("_05Drum")
	private _02Instrument instrument;

	@Value("${song}")
	private String song;
	
	public void perform() {
		System.out.println("Song is " + song);
		instrument.play();
	}

}
