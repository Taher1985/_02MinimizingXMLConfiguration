package _14_com.spring.javaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class _04JavaConfig {

	public _04JavaConfig() {
		super();
	}

	@Bean
	public _01Performer instrumentalist() {
		return new _05Instrumentalist(saxophone(), "Dill");
	}

	@Bean
	public _01Performer poeticInstrumentalist() {
		return new _06PoeticInstrumentalist(sonnet(), saxophone());
	}

	@Bean
	public _02Instrument saxophone() {
		return new _08Saxophone();
	}

	@Bean
	public _02Instrument drum() {
		return new _07Drum();
	}

	@Bean
	public _03Poem tonnet() {
		return new _09Tonnet();
	}

	@Bean
	public _03Poem sonnet() {
		return new _10Sonnet();
	}
}
