package com.techlabs.evenodd;
public class EvenOdd {

	final int range = 100;

	public void printEvenNumbers() {

		System.out.println("Even Numbers: ");
		for (int i = 1; i <= range; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

	public void printOddNumbers() {

		System.out.println("Odd numbers: ");
		for (int i = 1; i <= range; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

}
