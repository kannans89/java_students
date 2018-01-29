package com.practice.patterns.structural.composite.ex1.test;

import com.practice.patterns.structural.composite.ex1.Invoice;
import com.practice.patterns.structural.composite.ex1.LineItem;

public class TestInvoice {

	public static void main(String[] args) {
		
		Invoice mainInvoice = new Invoice("Main Invoice", "This contains all the important details..");
		Invoice bookInvoice = new Invoice("BookInvoice", "This is the BookInvoice for the College Library..");
		Invoice phoneInvoice = new Invoice("Phone Invoice", "This is the PhoneInvocie for Mobile shop..");
		Invoice smartPhoneInvoice = new Invoice("Smart Phone Invocie", "This is the SmartPhoneInvoice for Employees of the Research institute..");
		
		LineItem book1 = new LineItem(101, "Java", 6);
		LineItem book2 = new LineItem(105, "C++", 3);
		LineItem book3 = new LineItem(110, "Design Patterns", 8);
		
		LineItem smartPhone1 = new LineItem(01, "Apple", 9);
		LineItem smartPhone2 = new LineItem(03, "Samsung", 4);
		
		LineItem phone1 = new LineItem(501, "Micromax", 12);
		LineItem phone2 =new LineItem(502, "BlackBerry", 3);
		
		smartPhoneInvoice.addItems(smartPhone1);
		smartPhoneInvoice.addItems(smartPhone2);
		
		phoneInvoice.addItems(phone1);
		phoneInvoice.addItems(phone2);
		phoneInvoice.addItems(smartPhoneInvoice);
		
		bookInvoice.addItems(book1);
		bookInvoice.addItems(book2);
		bookInvoice.addItems(book3);
		
		mainInvoice.addItems(bookInvoice);
		mainInvoice.addItems(phoneInvoice);
		
		mainInvoice.printOrderDetails();
		
	}
	
}
