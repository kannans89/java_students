package com.practice.chapter9;

public class Duck {
	int size;

	public Duck(int duckSize) {
		System.out.println("Quak..Quak..!!");
		if (duckSize == 0) {
			size = 27;
		} else {
			size = duckSize;
		}
		System.out.println("Size is " + size);
	}

}
