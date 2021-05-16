package com.todoapp.todoapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import com.todoapp.todoapp.models.Todo;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
    List<Todo> findTodoByStatus(String status);
    Todo findTodoById(Long id);
}