package com.techlabs.numbers.test;
import com.techlabs.numbers.EvenNumbers;
import com.techlabs.numbers.OddNumbers;

public class TestEvenAndOdd {
	public static void main(String args[]) {

		int[] numbers = new int[201];
		
		for (int index = 1; index < numbers.length; index++) {
			numbers[index] = index;
		}
		
		EvenNumbers.checkEvenNumber(numbers);
		System.out.println();
		OddNumbers.checkEvenNumber(numbers);
	}

	public static void printNumbersSeries(int[] num) {
		for (int numb : num) {
			System.out.print(numb + " ");
		}
	}
}
	

