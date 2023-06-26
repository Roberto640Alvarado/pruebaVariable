package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class prueba {

    @Value("${DATASOURCE_URL}")
    private String secret;

    public static void main(String[] args) {
        SpringApplication.run(PruebaVariableApplication.class, args);
    }

    @PostConstruct
    public void printSecret() {
        System.out.println(secret);
    }
}


