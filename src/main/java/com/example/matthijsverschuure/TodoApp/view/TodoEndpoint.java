package com.example.matthijsverschuure.TodoApp.view;

import com.example.matthijsverschuure.TodoApp.controller.TodoService;
import com.example.matthijsverschuure.TodoApp.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;


@RestController
@RequestMapping("/todo")

public class TodoEndpoint {
    @Autowired
    TodoService todoService;

    @PostMapping("/nieuwe-todo")
    public Todo nieuwLeerdoel(@RequestBody Todo todo) {
        return todoService.nieuweTodo(todo);
    }

    @GetMapping("/all")
    public Iterable<Todo> haalAlleTodos() {
        return todoService.haalAlleTodos();

    }

    @GetMapping("/{id}")
    public Todo haalTodoBijId(@PathVariable(value = "id") long id) {
        Todo todo = todoService.haalTodoBijId(id);
        if (todo == null) {
            throw new NoSuchElementException("");
        }
        return todo;
    }

    @PutMapping("/{id}/afgerond")
    public Todo todoAfgerond(@PathVariable(value = "id") long id) {
        return todoService.todoAfgerond(id);
    }

    @PutMapping("/{id}/niet-afgerond")
    public Todo todoNietAfgerond(@PathVariable(value = "id") long id) {
        return todoService.todoNietAfgerond(id);
    }

    @DeleteMapping("/verwijder/{id}")
    public void verwijderTodoBijId(@PathVariable(value = "id") long id) {
        todoService.verwijderTodoBijId(id);
    }

}
