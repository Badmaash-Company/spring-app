package com.spring.test.testProg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.spring.test.testProg.model.Batsman;

@Configuration
public class AppConfig {

	@Bean
	public Batsman sachin(){
		return Batsman.builder()
				.id(3)
				.name("Sachin Tendulkar")
				.build();
	}
}
