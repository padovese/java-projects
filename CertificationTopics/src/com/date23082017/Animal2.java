package com.date23082017;

public class Animal2 {
	private int age;
	private String name;
	
	public Animal2(int age, String name){
		super();
		this.age = age;
		this.name = name;
	}
	
	public Animal2(int age) {
		super();
		this.age = age;
		this.name = "no one";
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
}
