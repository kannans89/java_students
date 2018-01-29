package com.practice.chapter8.template;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuckSortTest {

	public static void main(String[] args) {
		List<Duck> ducks = new ArrayList<Duck>();

		ducks.add(new Duck("Daffy", 8));
		ducks.add(new Duck("sammy", 5));
		ducks.add(new Duck("Howard", 12));
		ducks.add(new Duck("Donald", 6));
		ducks.add(new Duck("Hawkey", 7));

		System.out.println("Before Sorting..");
		display(ducks);

		Collections.sort(ducks);

		System.out.println("\nAfter Sorting..");
		display(ducks);
	}

	private static void display(List<Duck> ducks) {
		for (Duck item : ducks) {
			System.out.println(item);
		}
	}

}
