package com.techlabs.evenoddnumbers;


public class Nnumbers {

	private int size = 100;
	private int[] numbers = new int[size];

	public void printEvenNo() {
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				numbers[i] = i;
				System.out.println("even numbers are" + numbers[i]);
			}
			
		}	
		
	}

	public void printOddNo() {
		for (int i = 0; i < size; i++) {
			if (i % 2 != 0) {
				numbers[i] = i;
			}
			System.out.println("Odd numbers are" + numbers[i]);
		}
	}

}