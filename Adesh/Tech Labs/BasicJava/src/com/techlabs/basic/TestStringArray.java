package com.techlabs.basic;

public class TestStringArray {
	public static void print(String names) {
		System.out.println(names);
	}

	public static void print(String[] NameArray) {
		for (int i = 0; i < NameArray.length; i++) {
			print(NameArray[i]);
		}

	}

	public static void main(String[] args) {
		String[] ManyNames = { "adesh", "aditi", "kannan" };
		print(ManyNames);

	}

}
