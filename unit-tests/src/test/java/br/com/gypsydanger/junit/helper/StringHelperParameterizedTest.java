package br.com.gypsydanger.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {
	
	StringHelper helper;
	private String input;
	private String expectedOutput;
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
		
	@Before
	public void setUp() {
		helper = new StringHelper();
	}
	
	@Parameters
	public static Collection<String[]> testConditions(){
		String expectedOutputs[][] = {
				{"AACD", "CD"},
				{"ACD", "CD"},
				{"CDEF", "CDEF"},
				{"CDAA", "CDAA"}				
		};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testTruncateAInFirst2PositionsWithFourChars() {
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
	}
}
