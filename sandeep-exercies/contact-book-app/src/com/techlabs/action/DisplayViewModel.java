package com.techlabs.action;

import java.util.ArrayList;

import com.techlabs.model.ContactBook;

public class DisplayViewModel {
	private ArrayList<ContactBook> books;

	public ArrayList<ContactBook> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<ContactBook> books) {
		this.books = books;
	}
}
