package com.practice.basic;

public class TestIntArray {
	public static void print(String text) {
		System.out.println(text);
	}

	public static void print(int[] numArray) {
		for (int j = 0; j < numArray.length; j++) {
			print(numArray[j] + " ");
		}
	}

	public static void main(String[] args) {
		int[] nos = { 23, 4, 56, 76, 77 };
		print("length of the array is " + args.length);
		print(nos);

	}

}
