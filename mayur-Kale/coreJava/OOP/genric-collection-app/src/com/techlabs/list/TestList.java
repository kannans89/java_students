package com.techlabs.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<Integer> numbers;
		
		//Ordered Collections
		
		numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		display(numbers);

		System.out.println("---------");

		numbers = new LinkedList<Integer>();
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		display(numbers);
	}

	private static void display(List<Integer> numbers) {
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}

}
