package com.date24082017;

public class Fish extends Animal{
	protected int size;
	private int age;
	protected int numberOfFins = 7;
	
	public Fish(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
}
