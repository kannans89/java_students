package com.techlabs.collections;

import java.util.ArrayList;

public class TestCollections {

	public static void main(String[] args) {
		
		ArrayList myList=new ArrayList();
		myList.add(new LineItem(101, "Book",5,100));
		myList.add(new LineItem(102, "Pen",4,50));
		myList.add(new LineItem(103, "Pencil",1,10));
		myList.add("Hello");
		
		//with Object class
		/*for(Object listCollector:myList){
			System.out.println(listCollector);
		}*/
		
		//with TypeCasting
		for(Object listCollector:myList){
			LineItem currentItem=(LineItem)listCollector;
			System.out.println("Id is :"+currentItem.getID()+" Price is : "+currentItem.getTotalprice());
		}
		
		
		
	}

}
