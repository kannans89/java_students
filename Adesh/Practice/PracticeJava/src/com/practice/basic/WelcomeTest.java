package com.practice.basic;

public class WelcomeTest {
	public static void print(String text) {
		System.out.print(text + " ");
	}

	public static void main(String[] args) {
		print("Length of the array " + args.length + "\n");
		// System.out.println("length of the Array "+args.length);
		for (int i = 0; i < args.length; i++) {
			print(args[i]);

		}
	}
}