package com.date13092017;

public class Bunny {
	
//	public static void main(String[] args) throws NoMoreCarrotsException{
//		eatCarrot();
//	}
//	
	public static void main(String[] args) {
		try {
			eatCarrot();
		} catch (NoMoreCarrotsException e) {
			System.out.println("Sad Rabbit");
		}
	}
	
	private static void eatCarrot() throws NoMoreCarrotsException{
		
	}
}
