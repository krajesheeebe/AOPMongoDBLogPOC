package com.rajesh.logApp;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class LogService {

	@Autowired
	MongoConfiguration mongoConfig;

	@Async
	public void storeInMongoDB(LogEntry log) {
		System.out.println("LogService1: " + new Date());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("logEntry", log);
		Document document = new Document(map);
		mongoConfig.getMongoCollection().insertOne(document);
		// Mocking time taken to write logs to Mongo DB
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("LogService2: " + new Date());
	}

}
