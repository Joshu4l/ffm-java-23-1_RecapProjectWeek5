package com.example.backend;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    // Service Instance ...
    private final TodoService todoService;
    // ... and its dependency injection:
    public TodoController(TodoService todoService) { this.todoService = todoService; }


    // INVOKING OF THE SERVICE CLASS'S METHODS BELOW:

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED) // REPRESENTING OUR RESPONSE HEADER
    public Todo createTodo(@RequestBody NewTodo newTodo) {

        return todoService.saveTodo(newTodo); // REPRESENTING OUR RESPONSE BODY
    }


    @GetMapping()
    @ResponseStatus(HttpStatus.OK) // REPRESENTING OUR RESPONSE HEADER
    public List<Todo> getAllTodos() {

        return todoService.findAllTodos(); // REPRESENTING OUR RESPONSE BODY
    }


    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Todo getToDoById(@PathVariable String id) {

        return todoService.findTodoById(id);
    }





    /*@PutMapping ("/{id}")
    public Todo putTodo(@PathVariable String id, @RequestBody Todo todo) {
        //TODO:
        return todoService.updateTodo(todo);
    }*/

    /*@DeleteMapping String deleteTodo() {
        //TODO:
        return null;
    }*/

}
