package _14_com.spring.javaBasedConfiguration;

public class _06PoeticInstrumentalist extends _05Instrumentalist {

	private _03Poem poem;
	
	private _02Instrument instrument;

	public _06PoeticInstrumentalist(_03Poem poem, _02Instrument instrument) {
		super();
		this.poem = poem;
		this.instrument = instrument;
	}

	public void perform() {
		super.perform();System.out.println();
		instrument.play();
		poem.recite();
	}
}
