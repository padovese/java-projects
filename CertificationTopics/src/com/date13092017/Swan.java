package com.date13092017;

public class Swan {
	int numberEggs = 0;
	
	public void setNumberEggs(int numberEggs) {
		if (numberEggs < 0) throw new IllegalArgumentException(
				"# Eggs mustn't be negative");
		this.numberEggs = numberEggs;
	}
	
	public static void main(String[] args) {
		Swan s = new Swan();
		s.setNumberEggs(-1);
		
		System.out.println(s.a);
		
		s.printLength();
	}
	
	String name;
	
	public void printLength() throws NullPointerException{
		System.out.println(name.length());
	}
	
	int a = Integer.parseInt(name);
}
