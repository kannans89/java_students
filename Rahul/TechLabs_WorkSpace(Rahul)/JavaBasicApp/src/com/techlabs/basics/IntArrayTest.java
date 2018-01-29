package com.techlabs.basics;

public class IntArrayTest {
	public static void main(String[] args) {
		int[] integerArray = { 10, 20, 30, 40, 50, 60 };
		print(integerArray);
		changeArrayValues(integerArray);
		print(integerArray);
	}

	static void print(int[] integerArray) {
		for (int numbers : integerArray) {
			System.out.println(numbers);
		}
	}

	static void changeArrayValues(int[] integerArray1) {
		for (int i = 0; i < integerArray1.length; i++) {
			integerArray1[i] = 0;
			// integerArray1=null;// it will nullify the address it was storing
			// and not the Heap

		}
	}

}
