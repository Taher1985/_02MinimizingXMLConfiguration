package _06_com.spring.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class _04Instrumentalist implements _01Performer {

	private String song;

	@Autowired
	private _02Instrument instrument;

	private _03Poem poem;

	@Autowired
	public _04Instrumentalist(_03Poem poem) {
		super();
		this.poem = poem;
	}

	@Autowired
	public void autowireMethod() {
		instrument.play();
		poem.recite();
	}

	public void setSong(String song) {
		this.song = song;
	}

	public void perform() {
		System.out.println("Song is " + song);
		instrument.play();
		poem.recite();
	}

}
