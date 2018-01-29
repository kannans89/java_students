package com.techlabs.contactbooktest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.contactbook.Book;
import com.techlabs.contactbook.BookOperations;

public class ContactBookTest {
	public static void main(String[] args) throws IOException {
		
		List<Book> books = new ArrayList<Book>();

		books.add(new Book("Pratibha", "Dhodi", "Dahanu", 334567890));
		books.add(new Book("Sarasvati", "Patil", "France", 1234567891));
		books.add(new Book("Sarasvati", "Patil", "India", 1234567892));
		books.add(new Book("Shweta", "Jha", "Noyda", 234567893));
		books.add(new Book("Indu", "Patel", "Peris", 1234567894));

		BookOperations operation = new BookOperations(books);

		
		//operation.createFile();
		//operation.addContacts();
		//operation.displayContacts();
		//operation.serachContact("Dhodi");
		operation.deleteContact("1234567894");
		operation.displayContacts();

	}
}