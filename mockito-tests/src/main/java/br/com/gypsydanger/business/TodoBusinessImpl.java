package br.com.gypsydanger.business;

import java.util.ArrayList;
import java.util.List;

import br.com.gypsydanger.data.api.TodoService;

public class TodoBusinessImpl {

	public TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String user) {
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoService.retrieveTodos(user);

		for (String todo : todos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}

		return filteredTodos;
	}

}
