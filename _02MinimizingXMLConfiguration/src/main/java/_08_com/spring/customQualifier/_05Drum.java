package _08_com.spring.customQualifier;

@StringnedInstrument
@Strummed
public class _05Drum implements _02Instrument {

	@Override
	public void play() {
		System.out.println("DUM DAMA DUM $$$");
	}

}
