package com.date17082017;

public class StudyingConstructors {
	public StudyingConstructors() {
		this(0);
	}
	
	public StudyingConstructors(int a) {
		this(a, 0);
	}

	public StudyingConstructors(int a, int b) {
		this(a, b, 0);
	}

	public StudyingConstructors(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
}
