package br.com.gypsydanger.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper helper;	
	
	@Before
	public void setUp() {
		helper = new StringHelper();
		System.out.println("before");
	}
	
	@After
	public void tearDown() {
		System.out.println("after");
	}
	
	@Test
	public void testTruncateAInFirst2PositionsWithFourChars() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2PositionsWithThreeChars() {		
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2PositionsWithNoAlteration() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}

	@Test
	public void testTruncateAInFirst2PositionsWithAAtTheEnd() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSameShouldBeTrue() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABCDAB"));
	}
	
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSameShouldBeFalse() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ACCDEF"));
	}
	
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSameWithOneChar() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSameWithTwoChar() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AA"));
	}
}
