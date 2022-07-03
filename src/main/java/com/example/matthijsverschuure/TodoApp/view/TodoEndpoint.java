package com.example.matthijsverschuure.TodoApp.view;

import com.example.matthijsverschuure.TodoApp.controller.TodoService;
import com.example.matthijsverschuure.TodoApp.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/todo")

public class TodoEndpoint {
    @Autowired
    TodoService todoService;

    @PostMapping("/nieuwe-todo")
    public Todo nieuwLeerdoel(@RequestBody Todo todo) {
        return todoService.nieuweTodo(todo);
    }

}
