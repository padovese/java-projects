package com.date14092017;

public class Test2 {
	String a;
	public static void main(String[] args) {
		Test2 t = new Test2();
		
		try{
		t.a.toString();
		} catch (NullPointerException e) {
			System.out.println("Pega");
		}
	}
}
