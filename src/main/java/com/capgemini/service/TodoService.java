package com.capgemini.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Event> todos = new ArrayList<Event>();
	static {
		todos.add(new Event("Learn Web Application Development", "Study", LocalDate.now()));
		todos.add(new Event("Learn Spring MVC", "Study", LocalDate.now()));
		todos.add(new Event("Learn Spring Rest Services", "Study", LocalDate.now()));
	}

	public List<Event> retrieveTodos() {
		return todos;
	}

	public void addTodo(Event todo) {
		todos.add(todo);
	}

	public void deleteTodo(Event todo) {
		todos.remove(todo);
	}

	public Event retrieveEvent(String name) {
	 
		return todos.stream().filter(event -> event.getName()
				.contains(name)).findFirst().orElse(null);
		
	}
}
