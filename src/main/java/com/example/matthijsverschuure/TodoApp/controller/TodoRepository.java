package com.example.matthijsverschuure.TodoApp.controller;

import com.example.matthijsverschuure.TodoApp.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
