package com.example.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    // Repo Instance...
    private final TodoRepo todoRepo;
    // ... and its dependency injection

    /*
        on HTML-page:
        board/todo
        board/doing
        board/done

        defined by todo-api-service.js
        getAllTodos
        getTodoById
        postTodo
        putTodo
        deleteTodo
     */

    @GetMapping("/")
    public List<String> getAllTodos() {
        return todoRepo.findAll();
    }






}
