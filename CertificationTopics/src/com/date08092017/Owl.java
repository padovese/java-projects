package com.date08092017;

public class Owl implements Nocturnal{
	public boolean isBlind() {
		return false;
	}
	
	public static void main(String[] args) {
		Nocturnal nocturnal = (Nocturnal)new Owl();
		System.out.println(nocturnal.isBlind());
		
	}
}
