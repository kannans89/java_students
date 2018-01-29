package com.practice.chapter16;

import java.util.TreeSet;

public class BookTestComparable {

	public static void main(String[] args) {
		new BookTestComparable().go();
	}

	private void go() {
		Book b1 = new Book("How cats work");
		Book b2 = new Book("Remix your body");
		Book b3 = new Book("God is great");

		TreeSet<Book> tree = new TreeSet<Book>();
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		System.out.println(tree);
	}

}
