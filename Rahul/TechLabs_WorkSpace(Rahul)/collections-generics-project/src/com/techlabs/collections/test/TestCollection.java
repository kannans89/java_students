package com.techlabs.collections.test;

import java.util.ArrayList;

import com.techlabs.collections.LineItem;

public class TestCollection {
	public static void main(String[] args) {
		ArrayList<Object> myList = new ArrayList<Object>();//the orignal task was to understand without
															//generics...but was giving warning..so entred <Object> as
															//generics
		myList.add(new LineItem(101,"Pens",10,2));
		myList.add(new LineItem(102,"Pencil",5,1));
		myList.add(new LineItem(103,"Eraser",10,5));
		myList.add("hi there");
		for(Object eachobject : myList){
			LineItem currentLineItem = (LineItem)eachobject;
			System.out.println("Id is "+currentLineItem.getProductID()+" Total :"+currentLineItem.getTotalPrice());
		}
		
	}

}
