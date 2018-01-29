package com.techlabs.passbyvalue;

public class TestIntArray {
	public static void printArray(int[] nos) {
		for (int i = 0; i < nos.length; i++) {
			System.out.print(nos[i]);
		}
		System.out.println("");
	}

	public static void changeArrayValue(int[] numArray) {
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = 0;
		}
	}

	public static void main(String[] args) {
		int[] nos = { 1, 2, 3, 4, 7 };
		printArray(nos);
		changeArrayValue(nos);
		printArray(nos);
	}
}
