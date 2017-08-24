package com.date24082017;

public class Shark extends Fish{
	private int numberOfFins = 8;
	
	public Shark() {
		this(0);
	}
	
	public Shark(int age) {
		super(age);
		this.size = 4;
	}
	
	public void displaySharkDetails() {
		System.out.print("Shark with age: " + getAge());
		System.out.print(" and " + size + "metter longs");
		System.out.println(" with " + super.numberOfFins + " fins.");
	}
}
