package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.entity.Todo;
import org.example.service.TodosService;
import org.example.service.TodosServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/todos")
@RequiredArgsConstructor
public class TodosController {
    private final TodosService todosService;
    @GetMapping
    public List<Todo> getTodos() {
        return todosService.getTodos();
    }
}
