package com.practice.basic;

public class FirstProgram {
	public static void main(String[] args) {
		System.out.print("Welcome to first program\n");
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
	}

}
