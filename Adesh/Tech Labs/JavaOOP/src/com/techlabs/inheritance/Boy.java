package com.techlabs.inheritance;

public class Boy extends Man {
	public void eat() {
		System.out.println("boy is eating");
	}

	@Override
	public void read() {
		System.out.println("boy is reading");
	}

}
