package com.rajesh.logApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class LogAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogAppApplication.class, args);
	}

}
