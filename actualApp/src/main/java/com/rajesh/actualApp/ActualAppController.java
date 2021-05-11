package com.rajesh.actualApp;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActualAppController {

	@Autowired
	ActualAppService actualAppService;
	
	@RequestMapping(method = RequestMethod.PUT, path = "/business")
	public ResponseEntity<BusinessResponse> doSomething(@RequestBody BusinessRequest request) {
		System.out.println("ActualAppController1: " + new Date());
		actualAppService.executeBusinessLogic();
		System.out.println("ActualAppController2: " + new Date());
		BusinessResponse response = new BusinessResponse("12345678", 100.50);
		return new ResponseEntity<BusinessResponse>(response, HttpStatus.OK);
	}
	
}
