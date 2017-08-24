package com.date24082017;

public class Elephant extends Mammal{
	public Elephant() {
		this(0);
	}
	
	public Elephant(int age) {
		super(age);
	}
	
	public static void main(String[] args) {
		Elephant e = new Elephant(14);
	}
}
