package com.practice.chapter6;

import java.util.ArrayList;

public class EvenOddArrayList {

	public static void main(String[] args) {
		EvenNoChecker evenNoChecker = new EvenNoChecker();
		OddNoChecker oddNoChecker = new OddNoChecker();

		ArrayList<Integer> intList = new ArrayList<Integer>();
		int sizeOfList = 200;
		System.out.println("Input Array is => ");

		for (int index = 1; index <= sizeOfList; index++) {
			intList.add(index);
			System.out.print(index + " ");
		}
		System.out.println("");

		evenNoChecker.printEvenNo(intList);
		oddNoChecker.printOddList(intList);

	}

}
