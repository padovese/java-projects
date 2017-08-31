package com.date29082017;

public class Kangaroo2 extends Marsupial2{
	public boolean isBiped() {
		return true;
	}
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}
	
	public static void main(String[] args) {
		Kangaroo2 joey = new Kangaroo2();
		joey.getMarsupialDescription();
		joey.getKangarooDescription();
	}
}
