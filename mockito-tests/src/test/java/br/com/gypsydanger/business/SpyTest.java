package br.com.gypsydanger.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SpyTest {

	@Test
	public void test() {
		List mockedSpyList = spy(ArrayList.class); //avoid to use spy, it will give you the possibility to change the business logic in the test
		
		assertEquals(0, mockedSpyList.size());
	
		//stub(mockedSpyList.size()).toReturn(5);
		//when(mockedList.size()).thenReturn(5);
		
		mockedSpyList.add("aa");
		
		assertEquals(1, mockedSpyList.size());
	}
}
