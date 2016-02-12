package com.spring.test.testProg;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.spring.test.testProg.model.Batsman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
	
	@Bean
	public Batsman sachin(){
		return Batsman.builder()
				.id(3)
				.name("Sachin Tendulkar")
				.build();
	}
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				   new AnnotationConfigApplicationContext(AppConfig.class);
	
        SpringApplication.run(App.class, args);

	}
}
