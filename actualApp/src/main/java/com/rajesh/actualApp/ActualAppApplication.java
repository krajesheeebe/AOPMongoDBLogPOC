package com.rajesh.actualApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class ActualAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActualAppApplication.class, args);
	}

}
