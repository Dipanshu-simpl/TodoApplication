package com.magoo.project.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.magoo.project.service.TodoService;
import com.magoo.project.todo.Todo;

@Controller
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@RequestMapping(value="/list-todos", method=RequestMethod.GET)
	public String retrieveTodos(ModelMap model)
	{
		model.put("todos", todoService.retrieveTodos("in28Minutes"));
		return "list-todos";
	}
	
	@RequestMapping(value="/add-todo" , method=RequestMethod.GET)
	public String addNewTodo(ModelMap model)
	{
		model.addAttribute("todo",new Todo(0,"in28Minutes","",new Date(),false));
		return "todo";
	}
	
	@RequestMapping(value="/add-todo" , method=RequestMethod.POST)
	public String addNewPostTodo(ModelMap model,@Valid Todo todo,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "todo";
		}
		todoService.addNewTodo("in28Minutes", todo.getDesc(), new Date(), false);
		model.clear();
		return "redirect:list-todos";
	}
	
	@RequestMapping(value="/delete-todo", method=RequestMethod.GET)
	public String deleteTodo(ModelMap model,@RequestParam int id)
	{
		todoService.deleteTodo(id);
		model.clear();
		
		return "redirect:list-todos";
	}
	
	
	@RequestMapping(value="/update-todo" , method=RequestMethod.GET)
	public String updateTodo(ModelMap model,@RequestParam int id)
	{
		Todo todo=todoService.RetrieveTodo(id);
		model.addAttribute("todo",todo);
		return "todo";
	}
	
	
	@RequestMapping(value="/update-todo", method=RequestMethod.POST)
	public String updateTodo(@Valid Todo todo,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "todo";
		}
		
		todoService.updateTodo(todo);
		return "redirect:list-todos";
		
	}
}
