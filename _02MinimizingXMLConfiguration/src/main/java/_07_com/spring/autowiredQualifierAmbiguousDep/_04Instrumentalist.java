package _07_com.spring.autowiredQualifierAmbiguousDep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class _04Instrumentalist implements _01Performer {

	@Autowired
	@Qualifier("drum")
	private _02Instrument instrumentDrum;
	
	@Autowired
	@Qualifier("tootoot")
	private _02Instrument instrumentSaxophone;
	
	@Autowired
	@Qualifier("guitarQualifier")
	private _02Instrument instrumentGuitar;


	public void perform() {
		instrumentDrum.play();
		instrumentSaxophone.play();
		instrumentGuitar.play();
	}

}
