package com.techlabs.contact.menu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import com.techlabs.contact.Contact;
import com.techlabs.store.BinaryDataStore;
import com.techlabs.store.IDataStore;

public class ContactMenu {

	public static void main(String[] args) throws Exception {
		show();
	}

	private static void show() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int choice = 0;
		long phoneNo = 0, id = 0;
		String fname, lname, email;
		IDataStore binaryDataStore = new BinaryDataStore();

		while (choice != 6) {
			System.out.println("My Contact Book");
			System.out.println("1.Add Contact");
			System.out.println("2.Update Contact");
			System.out.println("3.Display Contacts");
			System.out.println("4.Search Contact");
			System.out.println("5.Delete Contact");
			System.out.println("6.Exit");
			System.out.print("Select Your Choice:");
			choice = Integer.parseInt(reader.readLine());

			switch (choice) {
			case 1:
				System.out.print("\nEnter first name");
				fname = reader.readLine();
				System.out.print("Enter Last Name");
				lname = reader.readLine();
				System.out.print("Enter Email id");
				email = reader.readLine();
				System.out.print("Enter Contact Number");
				phoneNo = Long.parseLong(reader.readLine());
				binaryDataStore.addContacts(
						new Contact(fname, lname, email, phoneNo));
				System.out.println("Successful Added...");
				break;

			case 2:
				System.out.print("\nEnter Contact Id:");
				id = Integer.parseInt(reader.readLine());
				System.out.print("Enter first name");
				fname = reader.readLine();
				System.out.print("Enter Last Name");
				lname = reader.readLine();
				System.out.print("Enter Email id");
				email = reader.readLine();
				System.out.print("Enter Contact Number");
				phoneNo = Long.parseLong(reader.readLine());
				binaryDataStore.updateContact(new Contact(id, fname, lname, email, phoneNo));
				System.out.println("Done..");
				break;

			case 3:
				display(binaryDataStore.retrieveContacts());
				break;

			case 4:
				System.out.print("Enter First Name to Search contact:");
				fname = reader.readLine();
				display(binaryDataStore.searchContact(fname));
				break;

			case 5:
				System.out.println("Enter ID to Delete Contact:");
				id = Long.parseLong(reader.readLine());
				binaryDataStore.deleteContact(id);
				System.out.println("Successfully Deleted..");
				break;

			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Please Select Valid options..");
				break;
			}
		}
	}

	private static void display(List<Contact> contactsList) {
		System.out.println("ID \tFName \tLName \tEmail \tPhoneNo");
		for (Contact contact : contactsList) {
			System.out.println(contact.getId() + "\t" + contact.getFName()
					+ "\t" + contact.getLName() + "\t" + contact.getEmailId()
					+ "\t" + contact.getPhoneNo());
		}
		System.out.println();
	}

}
