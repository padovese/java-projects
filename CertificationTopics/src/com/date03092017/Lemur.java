package com.date03092017;

public class Lemur extends Primate implements HasTail{
	public boolean isTailStriped() {
		return false;
	}
	public int age = 10;
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		System.out.println(lemur.isTailStriped());
		
		
		Primate primate = lemur;
		System.out.println(primate.hasHair());
		System.out.println(lemur.hasHair());
		
		Lemur lemur2 = (Lemur)primate;
	System.out.println(lemur2.age);
	}
}
