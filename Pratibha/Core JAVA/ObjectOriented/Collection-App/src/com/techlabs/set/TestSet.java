package com.techlabs.set;


import java.util.*;

public class TestSet {

	public static void main(String[] args) {
		Set<Integer> numbers;
		//numbers=new HashSet();
		numbers=new LinkedHashSet();
		//numbers=new TreeSet();
		numbers.add(10);
		numbers.add(100);
		numbers.add(20);
		numbers.add(90);
		numbers.add(200);
		print(numbers);
	}

	private static void print(Set<Integer> numbers) {
		System.out.println(numbers);
	}
	}
