package com.rajesh.actualApp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Aspect
@Component
public class ActualAppAspect {

	@Before(value = "execution(* com.rajesh.actualApp.ActualAppController.*(..)) and args(request)")  
	public void beforeAdvice(JoinPoint joinPoint, BusinessRequest request) {
		String uri = "http://localhost:8080/log";
	    RestTemplate restTemplate = new RestTemplate();
	    LogEntry logEntry = new LogEntry("ActualApp", "Request", request.toString());
		restTemplate.put(uri, logEntry);
	}
	
	@After(value = "execution(* com.rajesh.actualApp.ActualAppController.*(..)) and args(response)")  
	public void afterAdvice(JoinPoint joinPoint, BusinessRequest response) {
		String uri = "http://localhost:8080/log";
	    RestTemplate restTemplate = new RestTemplate();
	    LogEntry logEntry = new LogEntry("ActualApp", "Response", response.toString());
		restTemplate.put(uri, logEntry);
	}
}
