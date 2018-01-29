package com.contact.tester;

public class ContactBookConsoleTester {

	public static void main(String[] args) {
		try {
			new ContactConsole().run();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}