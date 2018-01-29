package com.techlabs.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {

	public static void main(String[] args) {
		Set<Integer> numbers;

		numbers = new HashSet<Integer>(); 		// Unordered
		numbers = new LinkedHashSet<Integer>(); // Ordered
		numbers = new TreeSet<Integer>(); 		// Ordered & sorted
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(20);
		numbers.add(100);
		display(numbers);

	}

	private static void display(Set<Integer> numbers) {
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}

}
