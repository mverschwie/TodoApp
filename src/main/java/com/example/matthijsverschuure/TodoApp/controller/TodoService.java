package com.example.matthijsverschuure.TodoApp.controller;

import com.example.matthijsverschuure.TodoApp.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public Todo nieuweTodo(Todo todo) {
        todo.setDatumToegevoegd(LocalDateTime.now());
        return todoRepository.save(todo);

    }

    public Todo haalTodoBijId(long id) {
        if (todoRepository.existsById(id)) {
            return todoRepository.findById(id).get();
        }
        return null;
    }

    public Iterable<Todo> haalAlleTodos() {
        return todoRepository.findAll();
    }

    public void verwijderTodoBijId(long id) {
        todoRepository.deleteById(id);
    }

    public Todo todoAfgerond(long id) {
        Todo t = todoRepository.findById(id).get();
        t.setAfgerond(true);
        t.setDatumAfgerond(LocalDate.now());
        return todoRepository.save(t);
    }

    public Todo todoNietAfgerond(long id) {
        Todo t = todoRepository.findById(id).get();
        t.setAfgerond(false);
        t.setDatumAfgerond(null);
        return todoRepository.save(t);
    }

}
