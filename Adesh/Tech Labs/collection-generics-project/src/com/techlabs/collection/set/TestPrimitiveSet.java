package com.techlabs.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TestPrimitiveSet {

	public static void main(String[] args) {
		Set<Integer> uniqueDeptNo = new HashSet<Integer>();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter department nos.");
		for (int index = 1; index <= 10; index++) {
			uniqueDeptNo.add(scanner.nextInt());
		}

		System.out.println("nos.");
		print(uniqueDeptNo);

	}

	private static void print(Set<Integer> uniqueDeptNo) {
		/*
		 * for(Integer x:uniqueDeptNo){ System.out.println(x); }
		 */
		for (Iterator<Integer> i = uniqueDeptNo.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
	}

}
