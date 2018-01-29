package com.techlabs.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlabs.collections.LineItem;

public abstract class TestIterator {

	public static void main(String[] args) {
		List<LineItem> myList = new ArrayList<LineItem>();

		LineItem lineItem1 = new LineItem(105, "Pens", 10, 2);
		LineItem lineItem2 = new LineItem(106, "Books", 10, 10);
		LineItem lineItem3 = new LineItem(101, "Eraser", 5, 5);
		LineItem lineItem4 = new LineItem(102, "Drafter", 2, 300);
		LineItem lineItem5 = new LineItem(102, "Drafter", 2, 300);
		LineItem lineItem6 = new LineItem(105, "Pens", 10, 2);
		myList.add(lineItem1);
		myList.add(lineItem2);
		myList.add(lineItem3);
		myList.add(lineItem4);
		myList.add(lineItem5);
		myList.add(lineItem6);
		
		/*Iterator<LineItem> cursor = myList.iterator();
		while(cursor.hasNext()){
			LineItem currentLine = cursor.next();
			System.out.println("Product Id is :- "+currentLine.getProductID());
			System.out.println("Product Name is :- "+currentLine.getProductName());
		}*/
		for(Iterator<LineItem> cursor = myList.iterator(); cursor.hasNext(); ){
			LineItem currentLine = cursor.next();
			System.out.println("Product Id is :- "+currentLine.getProductID());
			System.out.println("Product Name is :- "+currentLine.getProductName());
		}

	}
}
