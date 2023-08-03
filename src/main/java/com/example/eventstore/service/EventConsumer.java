package com.example.eventstore.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.eventstore.model.Event;
import com.example.eventstore.repository.EventRepository;

@Service
public class EventConsumer {
    static Logger logger = LoggerFactory.getLogger(EventConsumer.class);

    private final EventRepository eventRepository;

    public EventConsumer(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @KafkaListener(topics = "ORDER_EVENT", groupId = "eventstore-group")
    public void consumeOrderEvent(Object order) {
        logger.info("Received Order Event: {}", order);
    }

    @KafkaListener(topics = "APPLICATION_EVENT", groupId = "eventstore-group")
    public void consumeApplicationEvent(Object message) {
        logger.info("Received Application Event: {}", message);
        Event event = new Event();
        event.setMessage(message.toString());
        eventRepository.save(event);
    }
}