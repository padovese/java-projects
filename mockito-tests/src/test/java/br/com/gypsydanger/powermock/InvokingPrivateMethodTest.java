package br.com.gypsydanger.powermock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

/**
 * @author Bruno Padovese
 * @since 11/09/2018 
 */

@RunWith(PowerMockRunner.class)
public class InvokingPrivateMethodTest {
	
	@Mock
	Dependency dependency;
	
	@InjectMocks
	SystemUnderTest systemUnderTest;
	
	@Test
	public void testInvokingPrivateMethod() throws Exception {
		List<Integer> stats = Arrays.asList(1, 2, 3);
		
		when(dependency.retrieveAllStats()).thenReturn(stats);
		
		assertEquals(6L, Whitebox.invokeMethod(systemUnderTest, "privateMethodUnderTest"));
	}
}