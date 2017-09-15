package com.date14092017;

public class Test1 {
	Object obj = new Integer(3);
	String str = (String) obj;
	
	public void test2() {
		System.out.println(str);
	}
	

	public void test() {
		try {
			System.out.println();
		} catch (Exception e) {
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.test2();
	}
	
}
