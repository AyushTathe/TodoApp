package com.todos.rest.webservices.main.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todos.rest.webservices.main.todo.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
    List<Todo> findByUsername(String username);
}
