package com.techlabs.day1;

public class TestForEach {

	public static void main(String[] args) {
		 //testIntArray();
		//testStringArray();

		testMaxNum();

	}

	private static void testMaxNum() {
		int[] numbers = {10, 50, 30, 60, 90,100,20,1000};

		int maxnum;
		maxnum = MaxNum(numbers);
		System.out.println("maximum number of the array is :" + maxnum);

	}

	public static void testIntArray() {
		int[] marks = { 10, 20, 30, 40, 50 };
		for (int mark : marks) {
			System.out.println(mark);
		}

	}

	public static void testStringArray() {

		String[] locaions = { "Andheri", "Thane" };
		for (String location : locaions) {
			System.out.println(location);
		}
	}

	public static int MaxNum(int[] numbers) {
		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}

		}
		return max;
	}

}
