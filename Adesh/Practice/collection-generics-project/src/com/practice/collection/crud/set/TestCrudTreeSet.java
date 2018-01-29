package com.practice.collection.crud.set;

import java.util.Set;
import java.util.TreeSet;

public class TestCrudTreeSet {

	public static void main(String[] args) {

		Set<String> treeSet = new TreeSet<String>();

		create(treeSet);
		read(treeSet);

		update(treeSet);
		System.out.println("After updation====>");
		read(treeSet);

		delete(treeSet);
		System.out.println("After deletion====>");
		read(treeSet);

	}

	private static void delete(Set<String> treeSet) {
		treeSet.remove("adesh");
	}

	private static void update(Set<String> treeSet) {
		if (treeSet.contains("adesh")) {
			treeSet.add("leena");
		}
	}

	private static void read(Set<String> treeSet) {
		for (String set : treeSet) {
			System.out.println(set);
		}
	}

	private static void create(Set<String> treeSet) {
		treeSet.add("kannan");
		treeSet.add("adesh");
		treeSet.add("rahul");
		treeSet.add("aditi");
		treeSet.add("adesh");
	}

}
