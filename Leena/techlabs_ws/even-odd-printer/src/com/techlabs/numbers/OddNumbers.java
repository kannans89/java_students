package com.techlabs.numbers;

import com.techlabs.numbers.test.TestEvenAndOdd;

public class OddNumbers {
	public static void checkEvenNumber(int[] numarray) {
		int oddkey = 0;
		int[] oddArray = new int[99];

		for (int index = 1; index < numarray.length; index++) {
			if (numarray[index] == 1) {
				System.out.println("1 is not odd nor even");
			} 
			else {
				if (numarray[index] % 2 != 0) {
					oddArray[oddkey] = index;
					oddkey++;
				}
			}
		}
			System.out.print("Odd numbers are : ");
			TestEvenAndOdd.printNumbersSeries(oddArray);

		}

	}

