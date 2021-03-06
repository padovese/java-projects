package br.com.gypsydanger.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import br.com.gypsydanger.data.api.TodoService;

public class TodoBusinessImplInjectMockTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingMock() {
		TodoService todoService = mock(TodoService.class);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);

		when(todoService.retrieveTodos("dummy"))
				.thenReturn(Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance"));

		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
		assertEquals(2, filteredTodos.size());
	}

	@Test
	public void testRetrieveTodosRelatedToSpring_usingMockAsEmptyList() {
		TodoService todoService = mock(TodoService.class);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);

		List<String> todos = Arrays.asList();

		when(todoService.retrieveTodos("dummy")).thenReturn(todos);

		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
		assertEquals(0, filteredTodos.size());
	}
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingMockAsEmptyList_usingBDD() {
		//Given
		TodoService todoService = mock(TodoService.class);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);

		List<String> todos = Arrays.asList();

		given(todoService.retrieveTodos("dummy")).willReturn(todos);

		//When
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
		
		//Then
		assertThat(0, is(filteredTodos.size()));
	}

	@Test(expected = NullPointerException.class)
	public void testRetrieveTodosRelatedToSpring_usingMockAsNull() {
		TodoService todoService = mock(TodoService.class);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);

		List<String> todos = null;

		when(todoService.retrieveTodos("dummy")).thenReturn(todos);

		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
		assertNull(filteredTodos.size());
	}
	
	@Test
	public void testDeleteTodosNotRelatedToSpring_usingBDD() {
		//Given
		TodoService todoService = mock(TodoService.class);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);

		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");

		given(todoService.retrieveTodos("dummy")).willReturn(todos);

		//When
		todoBusinessImpl.deleteTodosNotRelatedToSpring("dummy");
		
		//Then
		verify(todoService, times(1)).deleteTodo("Learn to Dance"); //times parameter is optional
		
		verify(todoService, never()).deleteTodo("Learn Spring MVC");
		
		verify(todoService, never()).deleteTodo("Learn Spring");
		//then(todoService).should(never()).deleteTodo("learn Spring"); //BDD way
	}
}
