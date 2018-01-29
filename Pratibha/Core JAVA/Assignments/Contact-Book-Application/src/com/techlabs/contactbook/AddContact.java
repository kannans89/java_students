package com.techlabs.contactbook;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class AddContact implements IBookOperationn {
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String COMMA_DELIMITER = ",";
	private List<Book> books;
	private List<Book> oldBooklist;
	private BufferedWriter fbw;

	public AddContact(List<Book> books, List<Book> booklist1) {
		this.books = books;
		this.oldBooklist = booklist1;
		System.out.println("old books size:" + oldBooklist.size());

	}

	public void doOperation() {
		for (Book book : books) {
			this.add(book);
		}
	}

	public void add(Book book) {

		try {
			OutputStreamWriter writer = new OutputStreamWriter(
					new FileOutputStream("Contact.csv", true), "UTF-8");
			BufferedWriter fbw2 = new BufferedWriter(writer);
			fbw = fbw2;
			int flag = 0;
			for (Book oldBook : oldBooklist) {
				Number c1 = book.getContact();
				Number c2 = oldBook.getContact();
				if ((c1.equals(c2))) {
					System.out.println("You are adding duplicate data");
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				oldBooklist.add(book);
				fbw.append(NEW_LINE_SEPARATOR);
				fbw.append(String.valueOf(book.getId()));
				fbw.append(COMMA_DELIMITER);
				fbw.append(book.getFirstName());
				fbw.append(COMMA_DELIMITER);
				fbw.append(book.getLastName());
				fbw.append(COMMA_DELIMITER);
				fbw.append(book.getAddress());
				fbw.append(COMMA_DELIMITER);
				fbw.append(String.valueOf(book.getContact()));
				System.out.println("one raw is added");

			}

		} catch (Exception e) {

			System.out.println("Error in CsvFileWriter !!!");

			e.printStackTrace();

		}

		finally {

			try {
				fbw.flush();
				fbw.close();

			} catch (IOException e2) {

				System.out.println("Error while flushing/"
						+ "closing fileWriter !!!");
				e2.printStackTrace();
			}
		}

	}

}
