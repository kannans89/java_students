package com.techlabs.contactstore;


public interface IDataStore {
	 void update(int id2, String fname, String lname, String mobile,
				String address);
	void delete(int id);
	void search(String fname);
	void save();
	void addContact(String fname, String lname, String address, String mobile);
	void displayContact(Contact c);
	void close();
	void retrive();
}
