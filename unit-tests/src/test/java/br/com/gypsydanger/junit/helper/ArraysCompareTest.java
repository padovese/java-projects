package br.com.gypsydanger.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author Bruno Padovese
 * @since 06/09/2018 
 */
public class ArraysCompareTest {
	
	@Test
	public void test() {
		int[] i = {10, 8, 14, 2};
		int[] expected = {2, 8, 10, 14};
		
		Arrays.sort(i);
		
		assertArrayEquals(expected, i);
	}
	
	@Test
	public void testNegativeScenario() {
		int[] i = {10, 8, 14, 2};
		int[] expected = {8, 2, 10, 14};
		
		assertArrayEquals(expected, i);
	}
	
	@Test(expected=NullPointerException.class)
	public void testNullPointerException() {
		int[] i = null;
		Arrays.sort(i);
	}
	
	@Test(timeout=1000)
	public void testPerformance() {
		int[] j = {20, 9, 76};
		for(int i = 0; i < 1_000_000; i++) {
			j[0] = i;
			Arrays.sort(j);
		}
	}
}