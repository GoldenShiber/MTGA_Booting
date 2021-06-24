package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import status.CharacterList;

@SpringBootApplication
public class JavaSpringEclipseExampleApplication {

	public static void main(String[] args) {
		CharacterList.getInstance();
		SpringApplication.run(JavaSpringEclipseExampleApplication.class, args);
	}

}
