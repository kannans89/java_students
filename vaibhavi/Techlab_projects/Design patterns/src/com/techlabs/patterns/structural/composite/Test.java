package com.techlabs.patterns.structural.composite;

public class Test {

	public static void main(String[] args) {

		IOrderComponent mainInvoice=new Invoice("Main_Invoice", "This is Main Invoice");
		IOrderComponent BookInvoice=new Invoice("Book_Invoice","This is Book Invoice");
		BookInvoice.add(new LineItem(1,"c++"));
		BookInvoice.add(new LineItem(2, "c#"));
		BookInvoice.add(new LineItem(3, "java"));
		IOrderComponent phoneInvoice=new Invoice("Phone_Invoice","This is phone invoice");
		phoneInvoice.add(new LineItem(1,"Nokia"));
		phoneInvoice.add(new LineItem(2, "Blackberry"));
		IOrderComponent smartPhones=new Invoice("Smart_phoneInvoice", "This is smart phone invoice");
		smartPhones.add(new LineItem(1,"Apple"));
		smartPhones.add(new LineItem(2, "Samsung"));
		phoneInvoice.add(smartPhones);
		mainInvoice.add(BookInvoice);
		mainInvoice.add(phoneInvoice);
	    mainInvoice.DisplayInfo();
			
		
		
	}

}
