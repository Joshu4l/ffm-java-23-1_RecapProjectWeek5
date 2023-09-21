package com.example.backend;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepo extends MongoRepository<Todo, String> {

    Todo findTodoBy(String id);

    //public Todo updateBy(String id);

}
