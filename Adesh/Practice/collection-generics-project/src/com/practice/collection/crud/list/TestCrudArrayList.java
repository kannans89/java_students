package com.practice.collection.crud.list;

import java.util.ArrayList;
import java.util.List;

public class TestCrudArrayList {

	public static void main(String[] args) {

		List<String> myArray = new ArrayList<String>();

		create(myArray);
		read(myArray);

		update(myArray);
		System.out.println("After updation====>");
		read(myArray);

		delete(myArray);
		System.out.println("After deletion====>");
		read(myArray);

	}

	private static void delete(List<String> myArray) {
		myArray.remove(4);
	}

	private static void read(List<String> myArray) {
		for (String element : myArray) {
			System.out.println(element);
		}
	}

	private static void update(List<String> myArray) {
			myArray.set(2, "leena");
	}

	private static void create(List<String> myArray) {
		myArray.add("adesh");
		myArray.add("kannan");
		myArray.add("rahul");
		myArray.add("aditi");
		myArray.add("adesh");
	}

}
