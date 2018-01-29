package com.techlabs.contactstore;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class CSVStoreDataStore implements IDataStore {
	List<Contact> contacts = new LinkedList<Contact>();

	private int id;
	private int oldid;

	private BinaryFileWriter binaryfilewriter;
	private BinaryFileReader binaryfilereader;

	public CSVStoreDataStore() {

		binaryfilewriter = new BinaryFileWriter(contacts);
		if ("src//Data/Contact.ser".length() != 0) {
			binaryfilereader = new BinaryFileReader();
			contacts=binaryfilereader.deserialize();
		}
		// contacts = csvfilereader.readFile();
		// oldid = binaryfilereader.getOldId();
	}

	@Override
	public void addContact(String fname, String lname, String address,
			String mobile) {
		id = createID();
		contacts.add(new Contact(id, fname, lname, address, mobile));

	}

	@SuppressWarnings("unchecked")
	public void retrive() {
	//	contacts = binaryfilereader.deserialize();
		Collections.sort(contacts, new IdComparator());
		for (Contact c : contacts) {
			displayContact(c);
		}
	}

	@Override
	public void displayContact(Contact c) {
		System.out.println("ID: " + c.getId());
		System.out.println("First Name: " + c.getFirstName());
		System.out.println("Last name: " + c.getLastName());
		System.out.println("Address: " + c.getAddress());
		System.out.println("Mobile number: " + c.getMobile());
		System.out.println();

	}

	@Override
	public void delete(int id1) {
		for (Contact c : contacts) {
			if (c.getId() == id1)
				contacts.remove(c);
		}
	}

	@Override
	public void search(String fname) {
		for (Contact c : contacts) {
			if (c.getFirstName().equalsIgnoreCase(fname))
				displayContact(c);
		}

	}

	@Override
	public void save() {
		this.binaryfilewriter.serialize(contacts);
	}

	public void close() {
		System.exit(0);
	}

	public void update(int id2, String fname, String lname, String mobile,
			String address) {
		int id3 = id2;
		for (Contact c : contacts) {
			if (c.getId() == id2) {
				contacts.remove(c);
				contacts.add(new Contact(fname, lname, mobile, address, id3));
			}

		}
	}

	protected static int idCounter;

	static {
		idCounter = getIdCounter();
	}

	public static synchronized int createID() {
		setCounter(++idCounter);
		return idCounter;
	}

	public static int getIdCounter() {

		Properties properties = new Properties();
		FileReader reader = null;
		int counter = 0;
		try {
			reader = new FileReader("src//data//idInfo.properties");
			properties.load(reader);
			counter = Integer.parseInt(properties.getProperty("Counter"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return counter;
	}

	public static void setCounter(int counter) {

		Properties properties = new Properties();
		FileWriter writer = null;
		try {
			writer = new FileWriter("src//data//idInfo.properties");
			properties.setProperty("Counter", String.valueOf(counter));
			properties.store(writer, null);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
