package com.practice.chapter16;

public class Book implements Comparable<Object> {
	protected String title;

	public Book(String t) {
		title = t;
	}

	@Override
	public int compareTo(Object b) {
		Book book = (Book) b;
		return (title.compareTo(book.title));
	}

	@Override
	public String toString() {
		return "Book title = " + title;
	}
}
