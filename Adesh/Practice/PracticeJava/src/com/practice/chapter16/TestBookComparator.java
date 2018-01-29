package com.practice.chapter16;

import java.util.Comparator;
import java.util.TreeSet;

public class TestBookComparator {

	public class BookCompare implements Comparator<Book> {
		@Override
		public int compare(Book one, Book two) {
			return (one.title.compareTo(two.title));
		}
	}

	public static void main(String[] args) {
		new TestBookComparator().go();
	}

	public void go() {
		Book b1 = new Book("Hi everybody");
		Book b2 = new Book("God is great");
		Book b3 = new Book("I love u");

		BookCompare bCompare = new BookCompare();
		TreeSet<Book> tree = new TreeSet<Book>(bCompare);
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		System.out.println(tree);
	}

}
