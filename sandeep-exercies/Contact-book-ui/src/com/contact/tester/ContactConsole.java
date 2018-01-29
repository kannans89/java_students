package com.contact.tester;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.contact.book.ContactBook;
import com.contact.book.ContactBookManager;

public class ContactConsole {
	
	private ContactBookManager ca1= new ContactBookManager();
	private Scanner sc;
	public void run() throws Exception{
		int n = 2;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. add contact\n2. view contact\n3. exit\nenter a number: ");

			n = sc.nextInt();

			switch (n) {
			case 1:
				new ContactConsole().AddToManager();
				break;

			case 2:
				new ContactConsole().printInfo();
				break;

			case 3:
				System.exit(0);
				break;
				
			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("wrong number enter");

			}

		}
	}
	
	public void AddToManager(){
	
		sc = new Scanner(System.in);
		ContactBook c=new ContactBook();
		System.out.print("first name: ");
		c.setFirstName(sc.nextLine());
		System.out.print("last name: ");
		c.setLastName(sc.nextLine());
		System.out.print("mobile: ");
		c.setMobile(sc.nextLine());
		System.out.print("email: ");
		c.setEmail(sc.nextLine());
		try {
			ca1.addContacts(c);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void printInfo() throws Exception{
		
		ArrayList<ContactBook>cb=new ArrayList<ContactBook>();
		try {
			 cb =new ContactBookManager().getContacts();
		} catch (ClassNotFoundException | IOException e) {

			System.out.println(e);
		}
		
		for (ContactBook s1 : cb) {

			System.out.println("\nfirst name: "+s1.getFirstName() + 
					"\nlast name: " + s1.getLastName() + 
					"\nmobile no.: " + s1.getMobile() + 
					"\nemail: "+ s1.getEmail() + 
					"\ncotact id: " + s1.getContactId()+"\n\n");
		}
	}
	
	
}
