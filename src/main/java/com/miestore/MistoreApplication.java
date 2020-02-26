package com.miestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class MistoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(MistoreApplication.class, args);
	}
}