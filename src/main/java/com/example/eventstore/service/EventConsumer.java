package com.example.eventstore.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class EventConsumer {
    static Logger logger = LoggerFactory.getLogger(EventConsumer.class);

    @KafkaListener(topics = "order-events", groupId = "eventstore-group")
    public void consumeOrderEvent(String message) {
        logger.info("Received order event: {}", message);
    }

    @KafkaListener(topics = "application-events", groupId = "eventstore-group")
    public void consumeApplicationEvent(String message) {
        logger.info("Received application event: {}", message);
    }
}