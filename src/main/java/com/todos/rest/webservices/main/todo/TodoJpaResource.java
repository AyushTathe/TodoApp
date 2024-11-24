package com.todos.rest.webservices.main.todo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todos.rest.webservices.main.todo.repository.TodoRepository;

@RestController
public class TodoJpaResource {
	private TodoRepository todoRepository;
	
	public TodoJpaResource( TodoRepository todoRepository)
	{
		this.todoRepository = todoRepository;
	}
	
	//Get Request for retrieving all the todos for username
	@GetMapping("/users/{username}/todos")
	public List<Todo> retrieveTodos(@PathVariable("username") String username)
	{
		return todoRepository.findByUsername(username);
	}
	
	@GetMapping("/users/{username}/todos/{id}")
	public Todo retrieveTodoById(@PathVariable("username") String username, @PathVariable("id") int id)
	{
		return todoRepository.findById(id).get();
	}
	
	@DeleteMapping("/users/{username}/todos/{id}")
	//Response Entity for giving the no content response . We can use void also to get 200 response
	public ResponseEntity<Void> deleteTodo(@PathVariable("username") String username, @PathVariable("id")int id)
	{
		todoRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/users/{username}/todos/{id}")
	public Todo updateTodo(@PathVariable("username") String username, @PathVariable("id")int id,@RequestBody Todo todo)
	{
		todoRepository.save(todo);
		return todo;
	}
	
	@PostMapping("/users/{username}/todos")
	public Todo createTodo(@PathVariable("username") String username,@RequestBody Todo todo)
	{	
		todo.setUsername(username);
		todo.setId(null);
		return todoRepository.save(todo);
	
	}
}
