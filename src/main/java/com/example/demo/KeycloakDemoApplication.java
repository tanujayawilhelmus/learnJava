package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class KeycloakDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakDemoApplication.class, args);
	}

}
