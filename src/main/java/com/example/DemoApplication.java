package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

/*	@Value("${test.name}")
	private String name;
*/	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
