package com.date13092017;

public class Cub extends Rabbit{
	public void hop() throws IllegalStateException{
		if(1 == 1) {
			throw new IllegalStateException("Cannot hop");
		}
	}
	
	public static void main(String[] args) {
		Cub c = new Cub();

		
		try {
			 hop2();
			 } catch (Exception e) {
			 System.out.println(e);
			 System.out.println(e.getMessage());
			 e.printStackTrace();
			 }
			 }
			 private static void hop2() {
			 throw new RuntimeException("cannot hop");
		
		
		
	}
}
