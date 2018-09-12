package br.com.gypsydanger.powermock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

/**
 * @author Bruno Padovese
 * @since 11/09/2018 
 */

@PrepareForTest(SystemUnderTest.class)
public class MockingConstructorTest {
	
	@InjectMocks
	SystemUnderTest systemUnderTest;
	
	@Mock
	ArrayList mockList;
	
	@Test
	public void testMockingConstructor() throws Exception {
		List<Integer> stats = Arrays.asList(1, 2, 3);
		
		when(mockList.size()).thenReturn(10);
		
		PowerMockito.whenNew(ArrayList.class).withAnyArguments().thenReturn(mockList);

		assertEquals(10, systemUnderTest.methodUsingAnArrayListConstructor());
	}
}

