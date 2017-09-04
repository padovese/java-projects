package com.date03092017;

public class Gorilla extends Animal{
	public String getName() {
		return "Gorilla";
	}
	
	public Gorilla() {
		super(0);
	}
	
	public static void main(String[] args) {
		Animal animal = new Gorilla();
		System.out.println(animal.getName());
	}
}
