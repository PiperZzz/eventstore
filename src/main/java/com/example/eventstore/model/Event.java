package com.example.eventstore.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "events")
@Data
public class Event {
    @Id
    private String id;
    private String message;
}