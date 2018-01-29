package com.practice.collection.crud.set;

import java.util.HashSet;
import java.util.Set;

public class TestCrudHashSet {

	public static void main(String[] args) {

		Set<String> mySet = new HashSet<String>();

		create(mySet);
		read(mySet);

		update(mySet);
		System.out.println("After updation====>");
		read(mySet);

		delete(mySet);
		System.out.println("After deletion====>");
		read(mySet);

	}

	private static void delete(Set<String> mySet) {
		mySet.remove("leena");
	}

	private static void update(Set<String> mySet) {
		if (mySet.contains("adesh")) {
			mySet.add("leena");
		}
	}

	private static void read(Set<String> mySet) {
		for (String set : mySet) {
			System.out.println(set);
		}
	}

	private static void create(Set<String> mySet) {
		mySet.add("kannan");
		mySet.add("adesh");
		mySet.add("rahul");
		mySet.add("aditi");
		mySet.add("adesh");
	}

}
