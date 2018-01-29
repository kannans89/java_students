package com.practice.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		
		List<LineItem> myList=new ArrayList<LineItem>();
		
		myList.add(new LineItem(101,"adesh",500,3));
		myList.add(new LineItem(102,"pravin",4000,6));
		myList.add(new LineItem(105,"rahul",3000,5));
		
		for(LineItem x:myList){
			System.out.println("id is = "+x.getId()+", Total price is = "+x.getTotalPrice());
		}
		
		
	}

}
