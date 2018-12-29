package _14_com.spring.javaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class _03JavaConfig {

	public _03JavaConfig() {
		super();
	}

	@Bean
	public _01Performer instrumentalist() {
		return new _04Instrumentalist();
	}

	@Bean
	public _02Instrument saxophone() {
		return new _06Saxophone();
	}
	
	@Bean
	public _02Instrument drum() {
		return new _05Drum();
	}
}
