package com.techlabs.basic;

public class WelcomeTest {
	public static void print(String text) {
		System.out.println(text);
	}

	public static void main(String[] args) {
		int size = args.length;
		print("size of the array " + size);
		for (int i = 0; i < size; i++) {
			print(args[i]);
		}
	}
}
