package com.date08092017;

public class Spider extends Arthropod{
	public void printName(int input) {
		System.out.println("Spider");
	}
	
	public static void main(String[] args) {
		Spider spider = new Spider();
		spider.printName(1);
		spider.printName(1.0);
	}
}
