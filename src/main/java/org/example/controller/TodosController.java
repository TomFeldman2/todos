package org.example.controller;

import org.example.entity.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/todos")
public class TodosController {
    @GetMapping
    public List<Todo> getTodos() {
        return List.of(new Todo(1L, "Presentation about open telemetry", false));
    }
}
