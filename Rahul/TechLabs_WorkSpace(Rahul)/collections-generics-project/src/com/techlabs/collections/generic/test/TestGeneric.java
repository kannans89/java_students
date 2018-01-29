package com.techlabs.collections.generic.test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import com.techlabs.collections.LineItem;
import com.techlabs.collections.comparetosort.ProductNameCompare;

public class TestGeneric {

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
		
		
		System.out.println("Before sort() :- "+myList);
		//ProductIdcompare pIdcompareObj = new ProductIdcompare();
		ProductNameCompare pNameCompareObj = new ProductNameCompare();
		//ProductPriceCompare pPriceCompareObj = new ProductPriceCompare();
		
		//Collections.sort(myList,pIdcompareObj);
		//System.out.println("After sort() :- "+myList);
		
		TreeSet<LineItem> mySet = new TreeSet<LineItem>(pNameCompareObj);
		mySet.addAll(myList);
		System.out.println("After Removing Duplicates and sort:- "+mySet);
		
		/*if(lineItem1.checkForDuplicate(lineItem2)== false){
			myList.add(lineItem2);
		}else
		{
			System.out.println("Product with "+lineItem2.getProductID()+" already Present.");
		}*/
		
		/*boolean isEqual = lineItem1.equals(lineItem2);
		if(isEqual == true){
			System.out.println("Product ID are Same.");
		}*/

		/*for (LineItem eachobject : myList) {
			LineItem currentLineItem = eachobject;
			System.out.println("Id is " + currentLineItem.getProductID()
					+ " Total :" + currentLineItem.getTotalPrice());
		}*/

	}

}
