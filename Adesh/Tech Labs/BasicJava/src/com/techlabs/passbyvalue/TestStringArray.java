package com.techlabs.passbyvalue;

public class TestStringArray {

	public static void printArray(String[] names) {
		for (String x : names) {
			System.out.print(x + " ");
		}
		System.out.println(" ");
	}

	public static void changeStringArray(String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = "techlabs";
		}
	}

	public static void main(String[] args) {
		String[] names = { "adesh", "kannan", "aditi" };
		printArray(names);
		changeStringArray(names);
		printArray(names);
	}

}
