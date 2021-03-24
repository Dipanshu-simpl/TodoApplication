package com.magoo.project.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.magoo.project.todo.Todo;

@Service
public class TodoService {

	private static List<Todo> todos=new ArrayList<>();

	private static int todoCount=3;
	static
	{
		todos.add(new Todo(1,"in28Minutes","Learn Spring Framework",new Date(),false));
		todos.add(new Todo(2,"in24Mintes","Learn Hibernate Framework",new Date(),false));
		todos.add(new Todo(3,"in22Minutes","Learn ReactJs Framework",new Date(),false));
	}
	
	// add a new Todo
	
	public void addNewTodo(String user,String desc,Date targetDate,boolean isDone)
	{
		todos.add(new Todo(++todoCount,user,desc,targetDate,isDone));
	}
	
	// delete/remove a todo
	
	public void deleteTodo(int id)
	{
		Iterator<Todo> iterator=todos.iterator();
		while(iterator.hasNext())
		{
			Todo todo=iterator.next();
			if(todo.getId()==id)
			{
				iterator.remove();
			}
		}
	}
	
	
	// retrieve todos
	
	public List<Todo> retrieveTodos(String user) {
		List<Todo> filteredTodos = new ArrayList<Todo>();
		for (Todo todo : todos) {
			if (todo.getUser().equals(user))
				filteredTodos.add(todo);
		}
		return filteredTodos;
	}
	
}
