package _14_com.spring.javaBasedConfiguration;

public class _06PoeticInstrumentalist extends _05Instrumentalist {

	private _03Poem poem;

	public _06PoeticInstrumentalist(_03Poem poem) {
		super();
		this.poem = poem;
	}

	public _06PoeticInstrumentalist(int beanBags, _03Poem poem) {
		this.poem = poem;
	}

	public void perform() {
		super.perform();
		System.out.print("While reciting poems ");
		poem.recite();
	}
}
