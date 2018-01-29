package com.techlabs.contact;

import com.techlabs.addcontact.AddContact;
import com.techlabs.filehandler.CsvFileReader;
import com.techlabs.filehandler.CsvFileWriter;

import IDGenerator.ReadFromProperty;
import IDGenerator.WriteIntoProperty;

public class ContactList {
	private static long idCounter;
	private static int start = 0;
	private static int set = 0;
	private String fileName;

	public ContactList(String filename)
	{
		this.fileName=filename;
	}
	static {
		idCounter = ReadFromProperty.getProperty();
	}

	public void addContact(String fname, String lname, long contact, String email, String fileName) {
		AddContact cont = new AddContact(fname, lname, contact, email);
		Contact con = new Contact(createID(), cont);
		set = 1;
	}

	public static synchronized long createID() {
		return ++idCounter;
	}

	public void close() {
		if (set != 0) {

			
			CsvFileWriter.writeCsvFile(fileName);
			CsvFileWriter.exit();
			WriteIntoProperty.setProperty(idCounter);
		} else {
			System.out.println("Successfull Exit..");
		}
	}

	public void searchByName(String name) {
		if (Contact.search(name) == false) {
			System.out.println("Contact Not Found....");
		}
	}

	public void display(String fileName) {
		if (start == 0) {
			CsvFileReader.readCsvFile(fileName);
			Contact.displayContact();
			start = 1;
		} else {
			Contact.displayContact();
		}
	}

	public void updateDetails(int id, String fname, String lname, long number, String email) {
		set = 1;
		if (Contact.update(id, fname, lname, number, email) == true) {
			System.out.println("successfull...");
		} else {
			System.out.println("Id is not Correct...");
		}
	}

	public void deleteContact(int id) {
		set = 1;
		if (Contact.deleteContact(id) == true) {
			System.out.println("Successfully deleted...");
		} else {
			System.out.println("ID not found...");
		}

	}

}
