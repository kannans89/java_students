package com.techlabs.basic;

public class TestForEach {

	public static void print(String text) {
		System.out.println(text);
	}

	public static void print(int no) {
		System.out.println(no);
	}

	public static void testStringArray() {
		String[] stringNames = { "adesh", "aditi", "kannan" };
		for (String name : stringNames) {
			print(name);
		}
	}

	public static void testIntArray() {
		int[] nos = { 10, 20, 30, 40, 50 };
		for (int no : nos) {
			print(no);
		}
	}

	public static void main(String[] args) {
		testStringArray();
		testIntArray();

	}

}
