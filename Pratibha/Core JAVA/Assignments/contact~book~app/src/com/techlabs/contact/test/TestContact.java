package com.techlabs.contact.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;


import com.techlabs.contact.ContactList;

public class TestContact {

	public static void main(String args[])throws Exception
	{
		int option=0,id;
		long contact;
		String fname,lname,email;
		String fileName = "student.csv";
		ContactList list=new ContactList(fileName);
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		while(option!=6)
		{
		System.out.println("Welcome to Contact Book...");
		System.out.println("1.Display Contact....");
		System.out.println("2.Add Contact....");
		System.out.println("3.Update Contact...");
		System.out.println("4.Search Contact...");
		System.out.println("5.delete Contact..");
		System.out.println("6.Exit...");
		System.out.println("Select Choice..");
		option=Integer.parseInt(reader.readLine());
		switch(option)
		{
		case  1:
			list.display(fileName);
			break;
		case 2:
			System.out.println("Enter first name");
			fname=reader.readLine();
			System.out.println("Enter Last Name");
			lname=reader.readLine();
			System.out.println("Enter Contact Number");
			contact=Long.parseLong(reader.readLine());
			System.out.println("Enter Email id");
			email=reader.readLine();
			list.addContact(fname, lname, contact, email,fileName);
			break;
		case 3:
			System.out.println("Enter Contact Id to update Details");
			id=Integer.parseInt(reader.readLine());
			System.out.println("Enter first name");
			fname=reader.readLine();
			System.out.println("Enter Last Name");
			lname=reader.readLine();
			System.out.println("Enter Contact Number");
			contact=Long.parseLong(reader.readLine());
			System.out.println("Enter Email id");
			email=reader.readLine();
			list.updateDetails(id, fname, lname, contact, email);
			break;
		case 4:
			System.out.println("Enter first Name of contact to search:");
			fname=reader.readLine();
			list.searchByName(fname);
			break;
		case 5:
			System.out.println("Enter Contact Id to delete Contact..");
			id=Integer.parseInt(reader.readLine());
			list.deleteContact(id);
			break;
		case 6:
			list.close();
			break;

			default:
				System.out.println("Wrong choice....");
				break;
		}
		
		
		}
		
	}

}
