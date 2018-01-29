package com.techlabs.contact;

import java.util.ArrayList;

import com.techlabs.addcontact.AddContact;

public class Contact {
	private long id;
	private AddContact contact;
	private static ArrayList<Contact> list = new ArrayList<Contact>();

	public Contact(long id, AddContact contact) {
		this.id = id;
		this.contact = contact;
		list.add(this);
	}

	public long getId() {
		return id;
	}

	public AddContact getContact() {
		return contact;
	}

	public static ArrayList<Contact> getContactList() {
		return list;
	}

	public static void displayContact() {
		System.out.println("Contact Id, First Name, Last Name, Number , Email Id ");
		for (Contact con : list) {
			System.out.println();
			System.out.println("Contact ID=" + con.getId());
			System.out.println("Contact First Name=" + con.getContact().getFname());
			System.out.println("Contact Last Name=" + con.getContact().getLname());
			System.out.println("Contact Number=" + con.getContact().getContact());
			System.out.println("Contact Email ID=" + con.getContact().getEmail());
		}
	}

	public static boolean search(String name) {
		for (Contact con : list) {
			if (con.getContact().getFname().equalsIgnoreCase(name)) {
				System.out.println("Contact ID=" + con.getId());
				System.out.println("Contact First Name=" + con.getContact().getFname());
				System.out.println("Contact Last Name=" + con.getContact().getLname());
				System.out.println("Contact Number=" + con.getContact().getContact());
				System.out.println("Contact Email ID=" + con.getContact().getEmail());
			}
		}
		return false;

	}

	public static boolean update(int id, String first, String last, long number, String email) {
		for (Contact con : list) {
			if (con.id == id) {
				con.getContact().setFname(first);
				con.getContact().setLname(last);
				con.getContact().setContact(number);
				con.getContact().setEmail(email);
				return true;
			}
		}
		return false;
	}

	public static boolean deleteContact(int id) {
		for (Contact con : list) {
			if (con.id == id) {
				list.remove(con);
				return true;
			}

		}
		return false;
	}

}
