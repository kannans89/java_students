package com.techlabs.evenoddcheck.test;

import com.techlabs.evenoddcheck.EvenOddCheck;
import com.techlabs.printer.Printer;

public class EvenOddCheckTest {
	public static void main(String[] args) {
		EvenOddCheck evenOddCheck = new EvenOddCheck();
		Printer print = new Printer();

		for (int numberToCheck = 0; numberToCheck <= 200; numberToCheck++) {
			evenOddCheck.checkEvenOdd(numberToCheck);
		}
		System.out.print("Even numbers :- ");
		print.printNumbers(evenOddCheck.getevenNumbersList());
		System.out.print("Odd numbers :- ");
		print.printNumbers(evenOddCheck.getoddNumbersList());

	}

}
