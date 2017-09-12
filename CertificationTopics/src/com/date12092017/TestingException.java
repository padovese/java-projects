package com.date12092017;

public class TestingException {
	public static void main(String[] args) {
		
		int a[] = {1, 2, 3};
		
		try {
			System.out.println(a[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index doesn't exist.");
		} finally {
			System.out.println("End of the proccess.");
		}
		
		
	}
}
