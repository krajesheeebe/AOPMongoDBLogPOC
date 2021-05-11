package com.rajesh.logApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.codecs.configuration.CodecRegistries;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Configuration
public class MongoConfiguration {
	
	@Bean
	public MongoCollection<Document> getMongoCollection() {
		MongoClient mongoClient = MongoClients.create();
		CodecRegistry pojoCodecRegistry = CodecRegistries.fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build()));
		MongoDatabase db = mongoClient.getDatabase("mydb").withCodecRegistry(pojoCodecRegistry);
		return db.getCollection("logEntries");
	}
}