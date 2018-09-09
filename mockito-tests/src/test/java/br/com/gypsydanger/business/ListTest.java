package br.com.gypsydanger.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


public class ListTest {
	
	@Test
	public void testListSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2, listMock.size());
	}
	
	@Test
	public void testListDifferentSizes() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
	}
	
	@Test
	public void testListGetMethod() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("Padovese");
		assertEquals("Padovese", listMock.get(0));
		assertNull(listMock.get(1));
	}
	
	@Test
	public void testListGetMethodFromAnyInt() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenReturn("Padovese");
		assertEquals("Padovese", listMock.get(0));
		assertEquals("Padovese", listMock.get(99));
	}
	
	@Test(expected=RuntimeException.class)
	public void testListException() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Some Exception"));
		listMock.get(0);
	}
}
