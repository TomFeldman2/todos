package org.example.service;

import org.example.entity.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodosServiceImpl implements TodosService {
    @Override
    public List<Todo> getTodos() {
        return List.of(new Todo(1L, "Presentation about open telemetry", false));
    }
}
