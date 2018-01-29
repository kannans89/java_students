package com.techlabs.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {

		Map<Integer, String> numbers;
		numbers = new HashMap<Integer, String>(); // unordered
		numbers = new LinkedHashMap<Integer, String>(); // ordered
		numbers = new TreeMap<Integer, String>(); // sorted
		numbers.put(100, "Hundred");
		numbers.put(1, "One");
		numbers.put(40, "Fourty");
		numbers.put(5, "Five");
		numbers.put(3, "Three");
		numbers.put(3, "ThreeAgain");
		display(numbers);
	}

	private static void display(Map<Integer, String> numbers) {
		for (Map.Entry<Integer, String> keyValue : numbers.entrySet()) {
			System.out.println(keyValue.getKey() + " " + keyValue.getValue());
		}
	}

}
