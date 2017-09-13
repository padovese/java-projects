package com.date13092017;

public class AnotherExceptions {
	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} catch(RuntimeException e) {
			throw new RuntimeException();
		} finally {
			throw new Exception();
		}
	}
}
