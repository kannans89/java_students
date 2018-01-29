package com.techlabs.printevenodd;

public class Test {
	public static void print(String text) {
		System.out.println(text);
	}

	public static void main(String[] args) {
		EvenChecker evenCheck = new EvenChecker();
		OddChecker oddCheck = new OddChecker();

		int[] numArray = new int[200];
		inputArray(numArray);

		print(" ");
		print("===================================");
		print("Even nos are here =>");
		evenCheck.printEvenNo(numArray);

		print(" ");
		print("===================================");
		print("Odd nos are here =>");
		oddCheck.printOddNo(numArray);
	}

	private static void inputArray(int[] numArray) {

		print("Input Array =>");
		for (int index = 0; index < numArray.length; index++) {
			numArray[index] = index + 1;
			System.out.print(numArray[index] + " ");
		}
	}

}
