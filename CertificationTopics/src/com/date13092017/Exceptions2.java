package com.date13092017;

public class Exceptions2 {
	public String exceptions() {
		String result = "";
		String v = null;
		try {
		try {
		result += "before";
		v.length();
		result += "after";
		} catch (NullPointerException e) {
		result += "catch";
		throw new RuntimeException();
		} finally {
		result += "finally";
		throw new Exception();
		}
		} catch (Exception e) {
		result += "done";
		}
		return	result;
	}
	
	public static void main(String[] args) {
		Exceptions2 e = new Exceptions2();
		
		System.out.println(e.exceptions());
		
		System.out.println(1/0);
	}
}
