package com.techlabs.collections.crud;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	private static Map<String, String> integerMap;

	public static void main(String[] args) {

		integerMap = new HashMap<String, String>();
		addElement(integerMap);
		readElement(integerMap);
		readAllElements(integerMap);
		updateElements(integerMap);
		deleteElement(integerMap);

	}

	// Create
	public static void addElement(Map<String, String> mapToAddTO) {
		System.out.println("{Create - < C > }");
		mapToAddTO.put("A", "Apple");
		mapToAddTO.put("B", "Ball");
		mapToAddTO.put("Ba", "Ball");
		mapToAddTO.put("C", "Cat");
		mapToAddTO.put("D", "Dog");
		mapToAddTO.put("E", "Elephant");
		System.out.println("Elements in the Map are :- " + mapToAddTO);
		System.out
				.println("==================================================");

	}

	// Read
	public static void readElement(Map<String, String> mapToReadFrom) {
		if (mapToReadFrom.isEmpty()) {
			System.out.println("READ");
			System.out.println("Map Does not Contain any Elements To Display");
		} else {
			System.out.println("Keys in the Map are :- "
					+ mapToReadFrom.keySet());
			if (mapToReadFrom.containsKey("C")) {
				String valueOfKey = mapToReadFrom.get("C");
				System.out.println("The value for C is :- " + valueOfKey);
				System.out
						.println("==================================================");

			} else {
				System.out.println("Map Does not Contains Specified Key");
			}
		}

	}

	public static void readAllElements(Map<String, String> mapToReadFrom) {
		if (mapToReadFrom.isEmpty()) {
			System.out.println("READ");
			System.out.println("Map Does not Contain any Elements To Display");
		} else {
			System.out.println("Elements in the Map are:- "
					+ mapToReadFrom.values());
			System.out
					.println("==================================================");

		}

	}

	// Update
	public static void updateElements(Map<String, String> mapToUpdate) {
		if (mapToUpdate.containsValue("Dog")) {
			System.out.println("UPDATE");
			mapToUpdate.put("D", "Dinosour");
			System.out.println("Elements in the List after Update are :- "
					+ mapToUpdate);
			System.out
					.println("==================================================");

		} else {
			System.out.println("Element Not Present");
			System.out
					.println("==================================================");

		}
	}
	public static void deleteElement(Map<String, String> mapToDeleteFrom){
		if(mapToDeleteFrom.containsValue("Elephant")){
			mapToDeleteFrom.remove("E");
			System.out.println("Elements in the List are :- "+mapToDeleteFrom);
			System.out
			.println("==================================================");

		}
		else{
			System.out.println("Element not Present");
		}
		
		
	}
}
