package com.techlabs.numbers;

import com.techlabs.numbers.test.TestEvenAndOdd;

public class EvenNumbers {
	
	int evenkey=0;
	
			public static void checkEvenNumber(int[] numarray) {
				int evenkey = 0;
				int[] evenArray=new int[100];

			for (int index = 1; index < numarray.length; index++)
				if (numarray[index] % 2 == 0) {
	            evenArray[evenkey]=index;
	             evenkey++;
	             }
			
			System.out.print("Even numbers are : ");
			TestEvenAndOdd.printNumbersSeries(evenArray);			
		}
		
		

}
