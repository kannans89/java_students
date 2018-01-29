package com.practice.chapter6;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);

		print(list);
		printSum(list);
		printWithFor(list);
		printSumWithFor(list);

	}

	private static void printSumWithFor(ArrayList<Integer> list) {
		int sumFor = 0;
		for (int i = 0; i < list.size(); i++) {
			sumFor = sumFor + list.get(i);
		}
		System.out.println("");
		System.out.println("sum of the array is = " + sumFor);
	}

	private static void printWithFor(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

	private static void printSum(ArrayList<Integer> list) {
		int sum = 0;
		for (int x : list) {
			sum = sum + x;
		}
		System.out.println("");
		System.out.println("sum of the arraylist= " + sum);

	}

	private static void print(ArrayList<Integer> list) {
		for (int x : list) {
			System.out.print(x + " ");
		}
	}

}
