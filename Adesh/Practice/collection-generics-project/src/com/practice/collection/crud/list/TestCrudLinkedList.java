package com.practice.collection.crud.list;

import java.util.LinkedList;
import java.util.List;

public class TestCrudLinkedList {

	public static void main(String[] args) {

		List<String> myList = new LinkedList<String>();

		create(myList);
		read(myList);

		update(myList);
		System.out.println("After updation====>");
		read(myList);

		delete(myList);
		System.out.println("After deletion====>");
		read(myList);

	}

	private static void delete(List<String> myList) {
		myList.remove(4);
	}

	private static void update(List<String> myList) {
		myList.set(2, "leena");
	}

	private static void read(List<String> myList) {
		for (String list : myList) {
			System.out.println(list);
		}
	}

	private static void create(List<String> myList) {
		myList.add("kannan");
		myList.add("adesh");
		myList.add("rahul");
		myList.add("aditi");
		myList.add("adesh");
	}

}
