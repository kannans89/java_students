package com.techlabs.patterns.structural.composite.ex1.test;

import com.techlabs.patterns.structural.composite.ex1.Invoice;
import com.techlabs.patterns.structural.composite.ex1.LineItem;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice mainInvoice = new Invoice("Main Invoice", "This is the Main Invoice");
		Invoice bookInvoice = new Invoice("Book Invoice", "This is Invoice for Books");
		Invoice phoneInvoice = new Invoice("Phone Invoice", "This is Invoice for Phone");
		Invoice smartphoneInvoice = new Invoice("SmartPhone Invoice", "This is Invoice for SmartPhone");
		
		LineItem book1 = new LineItem(1, "C++", 5, 500.00);
		LineItem book2 = new LineItem(2, "C#", 4, 200.00);
		LineItem book3 = new LineItem(3, "Java", 10, 1500.00);
		
		LineItem phone1 = new LineItem(4, "Blackberry", 5, 50000.00);
		LineItem phone2 = new LineItem(5, "Micromax", 10, 70000.00);
		
		LineItem smartPhone1 = new LineItem(6, "IPhone", 2, 80000.00);
		LineItem smartPhone2 = new LineItem(7, "HTC", 2, 40000.00);
		
		mainInvoice.add(bookInvoice);
		bookInvoice.add(book1);
		bookInvoice.add(book2);
		bookInvoice.add(book3);
		
		mainInvoice.add(phoneInvoice);		
		phoneInvoice.add(phone1);
		phoneInvoice.add(phone2);		
		phoneInvoice.add(smartphoneInvoice);
		
		smartphoneInvoice.add(smartPhone1);
		smartphoneInvoice.add(smartPhone2);
		
		mainInvoice.printOrderDetails();
		
		


		
		
		

	}

}
