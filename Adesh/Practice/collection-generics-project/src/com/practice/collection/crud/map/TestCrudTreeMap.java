package com.practice.collection.crud.map;

import java.util.Map;
import java.util.TreeMap;

public class TestCrudTreeMap {

	public static void main(String[] args) {
		
		Map<Integer, String> myTreeMap = new TreeMap<Integer, String>();

		create(myTreeMap);
		read(myTreeMap);

		update(myTreeMap);
		System.out.println("After updation====>");
		read(myTreeMap);

		delete(myTreeMap);
		System.out.println("After deletion====>");
		read(myTreeMap);

	}

	private static void delete(Map<Integer, String> myTreeMap) {
		myTreeMap.remove(1);
	}

	private static void update(Map<Integer, String> myTreeMap) {
		myTreeMap.replace(2, "leena");
	}

	private static void read(Map<Integer, String> myTreeMap) {
		for (Map.Entry<Integer, String> set : myTreeMap.entrySet()) {
			System.out.print("key is = " + set.getKey());
			System.out.println(", Value is = " + set.getValue());
		}
	}

	private static void create(Map<Integer, String> myTreeMap) {
		myTreeMap.put(1, "kannan");
		myTreeMap.put(2, "adesh");
		myTreeMap.put(5, "rahul");
		myTreeMap.put(4, "aditi");
		myTreeMap.put(3, "adesh");
	}

}
