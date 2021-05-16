package com.todoapp.todoapp.controllers;

import com.todoapp.todoapp.models.Todo;
import com.todoapp.todoapp.models.JSONResponse;
import com.todoapp.todoapp.repositories.TodoRepository;
import com.todoapp.todoapp.services.Services;


import java.sql.Timestamp;
import java.util.concurrent.atomic.AtomicLong;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

@RequestMapping(path="/api")
@RestController
public class TodoController {

    @Autowired 
    private TodoRepository todoRepository;


	@PostMapping("/create-todo")
    public @ResponseBody String createTodo(@RequestBody Todo newTodo) {
        Instant instant1 = Instant.now();
        Timestamp sqlTimestamp = Timestamp.from(instant1);
        Todo n = new Todo();
        n.setCreatedOn(sqlTimestamp);
        n.setDesc(newTodo.getDesc());
        n.setLastUpdated(sqlTimestamp);
        n.setTitle(newTodo.getTitle());
        n.setStatus("Not Started");
        todoRepository.save(n);
        return "Success";
    }

    @GetMapping("/get-todo")
    public @ResponseBody Iterable<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @GetMapping("/get-todo/{status}")
    public @ResponseBody Iterable<Todo> getTodoByStatus(@PathVariable String status) {
        return todoRepository.findTodoByStatus(status);
    }


    @PatchMapping("/update/{id}")
    public @ResponseBody Todo updateTodo(@PathVariable Long id, @RequestBody Todo req) {
        Todo targetTodo = todoRepository.findTodoById(id);
        if (req.getDesc() != null) {
            targetTodo.setDesc(req.getDesc());
        }
        if (req.getTitle() != null) {
            targetTodo.setTitle(req.getTitle());
        }
        if (req.getStatus() != null) {
            targetTodo.setStatus(req.getStatus());
        }
        Timestamp timestamp = Services.generateTimestamp();
        targetTodo.setLastUpdated(timestamp);
        todoRepository.save(targetTodo);
        return targetTodo;
    }

    @DeleteMapping("/delete/{id}")
    public @ResponseBody JSONResponse deleteTodo(@PathVariable Long id) {
        Todo targetTodo = todoRepository.findTodoById(id);
        todoRepository.delete(targetTodo);
        JSONResponse res = new JSONResponse("Successfully Deleted");
        return res;
    }

}