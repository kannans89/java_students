package com.techlabs.basics;

public class WelcomeTest {
	public static void main(String[] args) {
		print("Welcome to Java");
		print("Array Size is : " + args.length);
		print(args);
	}

	static void print(String[] names) {
		for(String name : names){
			print(name);
		}
	
	}

	static void print(String text) {
		System.out.println(text);

	}
}
