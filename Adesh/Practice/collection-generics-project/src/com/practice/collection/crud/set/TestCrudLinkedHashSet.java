package com.practice.collection.crud.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestCrudLinkedHashSet {

	public static void main(String[] args) {

		Set<String> items = new LinkedHashSet<String>();

		create(items);
		read(items);

		update(items);
		System.out.println("After updation====>");
		read(items);

		delete(items);
		System.out.println("After deletion====>");
		read(items);

	}

	private static void delete(Set<String> items) {
		items.remove("adesh");
	}

	private static void update(Set<String> items) {
		if (items.contains("adesh")) {
			items.add("leena");
		}
	}

	private static void read(Set<String> items) {
		for (String set : items) {
			System.out.println(set);
		}
	}

	private static void create(Set<String> items) {
		items.add("kannan");
		items.add("adesh");
		items.add("rahul");
		items.add("aditi");
		items.add("adesh");
	}

}
