package com.demo.controller;

import com.demo.model.Todo;
import com.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoRestController {

    @Autowired
    private TodoService service;

    @GetMapping("/showTodos")
    public List<Todo> showTodos(){
        return service.retrieveTodos("Nick");
    }

    @GetMapping("/showTodos/{id}")
    public Todo showTodo(@PathVariable Integer id){
        return service.retrieveTodo(id);
    }

}
