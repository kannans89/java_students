package com.practice.chapter4;

public class Dog {
	int size;
	String name;

	void bark() {
		if (size > 60) {
			System.out.println("woof woof");
		} else if (size > 14) {
			System.out.println("ruff ruff");
		} else {
			System.out.println("yip yip");
		}
	}
}
