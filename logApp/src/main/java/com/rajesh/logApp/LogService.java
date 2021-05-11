package com.rajesh.logApp;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class LogService {

	@Async
	public void storeInMongoDB() {
		System.out.println("LogService1: " + new Date());
		
		// Time Taken to write logs to DB
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("LogService2: " + new Date());
	}
	
}
