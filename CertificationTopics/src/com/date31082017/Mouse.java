package com.date31082017;

public class Mouse extends Rodent{
	protected int tailLength = 8;
	public void getMouseDetails() {
		System.out.println("[tail="+this.tailLength+",parentTail="+super.tailLength+"]");
	}
	
	public void abc() {
		System.out.println(super.tailLength);
	}
	
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.getRodentDetails();
		mouse.getMouseDetails();
		
		mouse.abc();
		
		System.out.println(Rodent.tailLength);
	}




}
