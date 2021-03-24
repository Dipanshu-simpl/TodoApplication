package com.magoo.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.magoo.project.service.TodoService;

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

}
