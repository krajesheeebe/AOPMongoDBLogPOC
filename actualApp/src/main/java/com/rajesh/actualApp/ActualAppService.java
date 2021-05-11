package com.rajesh.actualApp;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

@Service
public class ActualAppService {

	public void executeBusinessLogic() {
		System.out.println("ActualAppService1: " + new Date());
		
		// Time Taken to execute business logic
		try {
			TimeUnit.SECONDS.sleep(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("ActualAppService2: " + new Date());
	}
	
}
