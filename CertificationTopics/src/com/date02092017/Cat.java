package com.date02092017;

public class Cat implements Walk, Run{
	public int getSpeed() {
		return 1;
	}
	
	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
	}
}
