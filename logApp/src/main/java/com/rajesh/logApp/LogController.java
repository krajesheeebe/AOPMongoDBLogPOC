package com.rajesh.logApp;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

	@Autowired
	LogService logService;
	
	@RequestMapping(method = RequestMethod.PUT, path = "/log")
	public ResponseEntity<Object> addLogEntry(@RequestBody LogEntry log) {
		System.out.println(log);
		System.out.println("LogController1: " + new Date());
		logService.storeInMongoDB(log);
		System.out.println("LogController2: " + new Date());
		return new ResponseEntity<Object>(HttpStatus.ACCEPTED);
	}
	
}
