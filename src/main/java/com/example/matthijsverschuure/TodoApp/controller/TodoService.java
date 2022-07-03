package com.example.matthijsverschuure.TodoApp.controller;

import com.example.matthijsverschuure.TodoApp.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public Todo nieuweTodo(Todo todo) {
        return todoRepository.save(todo);
    }



}
