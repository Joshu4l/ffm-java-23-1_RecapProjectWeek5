package com.example.backend;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.UUID;


@Service
public class TodoService {

    // Repo Instance ...
    private final TodoRepo todoRepo;
    // ... and its dependency injection:
    public TodoService(TodoRepo todoRepo) { this.todoRepo = todoRepo; }


    // INVOKING THE SERVICE CLASS'S METHODS BELOW:
    public Todo saveTodo(NewTodo newTodo) {
        Todo todo = new Todo(UUID.randomUUID().toString(), newTodo.description(), Status.OPEN);
        return todoRepo.save(todo);
    }


    public List<Todo> findAllTodos() {
        return todoRepo.findAll();
    }


    public Todo findTodoById(String id)  {
        return todoRepo.findById(id).orElseThrow();
    }


    public Todo putTodoById(String id, Todo todo) {
        Todo updatedTodo = new Todo(id, todo.description(), todo.status());
        return todoRepo.save(updatedTodo);
    }


    public String deleteTodobyId(String id) {
        todoRepo.deleteById(id);
        return "Todo " + id + " successfully deleted.";
    }


    // EXCEPTION HANDLING (LOCAL + GENERAL)
    @ExceptionHandler(Exception.class) // picking up what might be thrown by the 'getByBrand'-method above
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleIllegalArgumentException(Exception e) {
        /*
            In here, first specify the general (handling) message that shall be returned to the client

            And (optionally) pick up the EXCEPTION OBJECT ('e') to map it on our ErrorMessage-class
            by passing in its own, individually-set message as the only argument:
        */
        String generalHandlingMessage = "Sorry, there seem to be matching entries for the brand you specified: ";
        ErrorMessage actualErrorMessageObject = new ErrorMessage(e.getMessage());
        /*
            After the instantiation of the ErrorMessage-object above,
            it can also be returned to the client (as a bonus if you will):
        */
        return generalHandlingMessage + actualErrorMessageObject;
    }

}
