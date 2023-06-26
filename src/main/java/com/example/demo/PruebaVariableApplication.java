package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaVariableApplication {
	
	@Value("${DATASOURCE_URL}")
	private static String secret;

	public static void main(String[] args) {
		System.out.println(secret);
		SpringApplication.run(PruebaVariableApplication.class, args);
	}
	
}
