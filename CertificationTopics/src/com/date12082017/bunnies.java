package com.date12082017;

import java.util.ArrayList;
import java.util.List;

public class bunnies {
	public static void main(String[] args) {
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("hoppy");
		bunnies.add("Hfloppy");
		System.out.println(bunnies);
		bunnies.removeIf(s -> s.toUpperCase().charAt(0) == 'H');
		System.out.println(bunnies);
	}
}
