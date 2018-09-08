package br.com.gypsydanger.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import br.com.gypsydanger.data.api.TodoService;
import br.com.gypsydanger.data.api.TodoServiceStub;

public class TodoBusinessImplTest {

	@Test
	public void testRetrieveTodosRelatedToSpring() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
	
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
		assertEquals(2, filteredTodos.size());
		assertNotNull(filteredTodos);
	}
	
}
