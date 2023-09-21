package com.example.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoController {

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

    // Service Instance...
    private final TodoService toDoService;
    // ... and its dependency injection

    @GetMapping()
    public String GetAllToDos() {


        return "test";
    }




}
