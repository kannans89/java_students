package com.techlabs.day1;

public class Welcome {
	public static void main(String args[]) {

		System.out.println("Welcome to Java");
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}

		else {
			System.out.println("Please pass some parameters");
		}
	}
}