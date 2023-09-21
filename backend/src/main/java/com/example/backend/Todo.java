package com.example.backend;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record Todo(

        String id,
        String description,
        Status status

) {
}
