package com.example.eventstore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.eventstore.model.Event;

public interface EventRepository extends MongoRepository<Event, String> {
    
}