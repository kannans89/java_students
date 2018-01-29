package com.practice.collection.crud.map;

import java.util.HashMap;
import java.util.Map;

public class TestCrudHashMap {

	public static void main(String[] args) {

		Map<Integer, String> myMap = new HashMap<Integer, String>();

		create(myMap);
		read(myMap);

		update(myMap);
		System.out.println("After updation====>");
		read(myMap);

		delete(myMap);
		System.out.println("After deletion====>");
		read(myMap);

	}

	private static void delete(Map<Integer, String> myMap) {
		myMap.remove(1);
	}

	private static void update(Map<Integer, String> myMap) {
		myMap.replace(2, "leena");
	}

	private static void read(Map<Integer, String> myMap) {
		for (Map.Entry<Integer, String> set : myMap.entrySet()) {
			System.out.print("key is = " + set.getKey());
			System.out.println(", Value is = " + set.getValue());
		}
	}

	private static void create(Map<Integer, String> myMap) {
		myMap.put(1, "kannan");
		myMap.put(2, "adesh");
		myMap.put(5, "rahul");
		myMap.put(4, "aditi");
		myMap.put(3, "adesh");
	}

}
