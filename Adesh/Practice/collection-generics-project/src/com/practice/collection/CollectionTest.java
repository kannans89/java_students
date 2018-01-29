package com.practice.collection;

import java.util.ArrayList;

public class CollectionTest {

	public static void main(String[] args) {

		LineItem item = new LineItem(101, "adesh", 5000, 3);
		System.out.println("Total price for " + item.getName() + " is = "
				+ item.getTotalPrice());

		try{
			
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add(new LineItem(102, "kannan", 300, 2));
		myList.add(new LineItem(103, "rahul", 800, 5));
		myList.add(new LineItem(107, "Leena", 4000, 5));
		myList.add("helllooo");
		myList.add(new LineItem(105,"pravin",4000,3));

		for (Object x : myList) {
			LineItem currentitem = (LineItem) x;
			System.out.println("Id is = " + currentitem.getId()
					+ ", Total price is = " + currentitem.getTotalPrice());
		}

		}catch(Exception ex){
			System.out.println("error: class cast exception");
         }
	}

}
