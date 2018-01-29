package com.practice.collection.crud.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestCrudLinkedHashMap {

	public static void main(String[] args) {
		Map<Integer, String> myLinkedMap = new LinkedHashMap<Integer, String>();
		
		
		create(myLinkedMap);
		read(myLinkedMap);

		update(myLinkedMap);
		System.out.println("After updation====>");
		read(myLinkedMap);

		delete(myLinkedMap);
		System.out.println("After deletion====>");
		read(myLinkedMap);

	}

	private static void delete(Map<Integer, String> myLinkedMap) {
		myLinkedMap.remove(1);
	}

	private static void update(Map<Integer, String> myLinkedMap) {
		myLinkedMap.replace(2, "leena");
	}

	private static void read(Map<Integer, String> myLinkedMap) {
		for (Map.Entry<Integer, String> set : myLinkedMap.entrySet()) {
			System.out.print("key is = " + set.getKey());
			System.out.println(", Value is = " + set.getValue());
		}
	}

	private static void create(Map<Integer, String> myLinkedMap) {
		myLinkedMap.put(1, "kannan");
		myLinkedMap.put(2, "adesh");
		myLinkedMap.put(5, "rahul");
		myLinkedMap.put(4, "aditi");
		myLinkedMap.put(3, "adesh");
	}

}
