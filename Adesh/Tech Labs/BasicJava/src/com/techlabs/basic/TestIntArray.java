package com.techlabs.basic;

public class TestIntArray {
	public static void print(String text) {
		System.out.println(text);
	}

	public static void print(int[] numArray) {
		for (int i = 0; i < numArray.length; i++) {
			print(numArray[i] + " ");
		}
	}

	public static void main(String[] args) {

		print("size of the array" + args.length);
		int[] numbers = { 10, 20, 30, 40, 50 };
		print(numbers);
	}
}
