package com.techlabs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlabs.model.Contact;
public class CSVStoreDataStore implements IDataStore {
	List<Contact> contacts = new ArrayList<Contact>();
	
	private int id;
	private int oldid;

	private CSVFileWriter csvfilewriter; 
	private BinaryFileReader csvfilereader;
	public CSVStoreDataStore() {
		csvfilewriter=new CSVFileWriter(contacts);
		csvfilereader = new BinaryFileReader(contacts);
		contacts = csvfilereader.readFile();
		oldid = csvfilereader.getOldId();
	}

	@Override
	public void addContact(String fname, String lname, String address,
			String mobile) {
		id = oldid;
		contacts.add(new Contact(id, fname, lname, address, mobile));

	}

	@SuppressWarnings("unchecked")
	public void retrive() {
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
			if(c.getId()==id1)
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
		this.csvfilewriter.fileWriter(contacts);
	}
	public void close(){
		System.exit(0);
	}

	public void update(int id2, String fname, String lname, String mobile,
			String address) {
		int id3=id2;
		for (Contact c : contacts) {
			if(c.getId()==id2){
				contacts.remove(c);
				contacts.add(new Contact(fname,lname,mobile,address,id3));
			}
		
			}
		
		
		
	}
}
