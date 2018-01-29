package com.techlabs.contactstoretest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import com.techlabs.contactstore.*;
public class ContactMenu {
	public static void main(String args[]) {

		String mobile;
		String fname, lname, address;
		//@SuppressWarnings("unused")
	//	String fileName = "student.csv";
		IDataStore csv = new CSVStoreDataStore();
		;
		int option = 0, id;
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		while (option != 7) {
			System.out.println("Welcome to Contact Book...");
			System.out.println("1.Display Contact....");
			System.out.println("2.Add Contact....");
			System.out.println("3.Update Contact...");
			System.out.println("4.Search Contact...");
			System.out.println("5.delete Contact..");
			System.out.println("6.save file");
			System.out.println("7.Exit");
			System.out.println("Select Choice..");
			try {
				option = Integer.parseInt(reader.readLine());
				switch (option) {
				case 1:
					csv.retrive();
					break;
				case 2:
					System.out.println("Enter first name");
					fname = reader.readLine();
					System.out.println("Enter Last Name");
					lname = reader.readLine();
					System.out.println("Enter address");
					mobile = reader.readLine();
					System.out.println("Enter mobile number");
					address = reader.readLine();
					csv.addContact(fname, lname, address, mobile);
					break;
				case 3:
					System.out.println("Enter Contact Id to update Details");
					id = Integer.parseInt(reader.readLine());
					System.out.println("Enter first name");
					fname = reader.readLine();
					System.out.println("Enter Last Name");
					lname = reader.readLine();
					System.out.println("Enter address");
					mobile = reader.readLine();
					System.out.println("Enter mobile number");
					address = reader.readLine();
					csv.update(id, fname, lname, mobile, address);
					break;
				case 4:
					System.out
							.println("Enter first Name of contact to search:");
					fname = reader.readLine();
					csv.search(fname);
					break;
				case 5:
					System.out.println("Enter Contact Id to delete Contact..");
					id = Integer.parseInt(reader.readLine());
					csv.delete(id);
					break;
				case 6:
					csv.save();
					break;
				case 7:
					csv.close();
					break;

				default:
					System.out.println("Wrong choice....");
					break;
				}

			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}

}
