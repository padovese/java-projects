package com.date08092017;

public class OwlSon extends Owl{
	public boolean isNaked() {
		return true;
	}
	
	public static void main(String[] args) {
		OwlSon owlSon = (OwlSon)new Owl();
		System.out.println(owlSon.isNaked());
	}
}
