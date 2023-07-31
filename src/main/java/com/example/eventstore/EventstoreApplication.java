package com.example.eventstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class EventstoreApplication {
	static Logger logger = LoggerFactory.getLogger(EventstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EventstoreApplication.class, args);
		logger.info("Eventstore Ready!");
	}

}