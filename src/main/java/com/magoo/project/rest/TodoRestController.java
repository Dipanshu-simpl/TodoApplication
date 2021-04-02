package com.magoo.project.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magoo.project.service.TodoService;
import com.magoo.project.todo.Todo;

@RestController
public class TodoRestController {
	
	
	@Autowired
	private TodoService todoService;
	
	@RequestMapping(path="/todos")
	public List<Todo> getAllTodos()
	{
		return todoService.retrieveTodos("in28Minutes");
	}
	
	
	@RequestMapping(path="/todos/{id}")
	public Todo RetrieveTodo(@PathVariable int id)
	{
		return todoService.RetrieveTodo(id);
	}

}
