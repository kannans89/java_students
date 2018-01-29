package com.techlabs.contactbook;

import java.util.List;

public class BookOperations {
	private IBookOperationn addContact;
	private Display display;
	private CreateFile createFile;
	private SearchContact search;
	private DeleteContact delete;
	private static LoadData loadData;
	public BookOperations(List<Book> books) {
		createFile =CreateFile.getCreateFile();
		loadData=LoadData.getLoadData();
		display =Display.getDisplay();
		search = new SearchContact();
		delete = new DeleteContact();
		addContact = new AddContact(books,loadData.getOldBooks());

	}

	public void addContacts() {
		addContact.doOperation();
	}

	public void displayContacts() {
		display.doOperation();
	}

	public void createFile() {
		createFile.doOperation();
	}

	public void serachContact(String str) {
		search.search(str);
	}

	public void deleteContact(String str) {
		delete.delete(str);
	}

}
