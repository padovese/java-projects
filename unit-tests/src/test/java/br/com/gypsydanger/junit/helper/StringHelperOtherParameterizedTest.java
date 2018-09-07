package br.com.gypsydanger.junit.helper;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperOtherParameterizedTest {

	StringHelper helper;
	private String input;
	
	@Before
	public void setUp() {
		helper = new StringHelper();
	}
	
	public StringHelperOtherParameterizedTest(String input) {
		this.input = input;
	}

	@Parameters
	public static Collection<String[]> testConditionsFirstAndLastCharacters(){
		String expectedOutputs[][] = {
				{"ABCDAB"},
				{"ACCDEF"},
				{"A"},
				{"AA"}
		};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSameShouldBeTrue() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame(input));
	}
	
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSameShouldBeFalse() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(input));
	}
	
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSameWithOneChar() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(input));
	}
	
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSameWithTwoChar() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame(input));
	}
}