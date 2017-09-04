package com.date03092017;

public interface Hop {
	static int getJumpHeight() {
		return 8;
	}
	
	default String getName() {
		return "no one";
	}
}
