package com.spring.test.testProg.model;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;

@Builder
public class Batsman implements Cricketer {

	@Getter
	@Setter
	public String name;
	
	@Getter
	@Setter
	public int id;
	
	public void speak() {
		System.out.println(String.format("I am a batsman. My name is: %s", name));
	}
}
