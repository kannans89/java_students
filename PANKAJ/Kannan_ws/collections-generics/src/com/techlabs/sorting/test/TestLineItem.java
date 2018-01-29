package com.techlabs.sorting.test;

import java.util.ArrayList;
import java.util.Collections;

import com.techlabs.sorting.LineItem;

public class TestLineItem {

	public static void main(String[] args) {

		ArrayList<LineItem> myList=new ArrayList<LineItem>();
		myList.add(new LineItem("Book",5,2,100));
		myList.add(new LineItem("Laptop",1,3,20000));
		myList.add(new LineItem("Tablet",3,8,12000));
		myList.add(new LineItem("Mobile",4,4,80000));
		
		Collections.sort(myList);
		System.out.println(myList);
		
	}

}
