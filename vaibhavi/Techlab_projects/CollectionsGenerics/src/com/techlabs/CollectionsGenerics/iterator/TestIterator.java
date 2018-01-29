package com.techlabs.CollectionsGenerics.iterator;

import java.util.ArrayList;
import java.util.Iterator;
public class TestIterator {

	public static void main(String[] args) {
		ArrayList<LineItem> items=new ArrayList<LineItem>();
		LineItem li1=new LineItem("book",1,3,500);
		LineItem li2=new LineItem("laptop", 2, 3, 25000);
		items.add(li1);
		items.add(li2);
		
		Iterator<LineItem> i=items.iterator();
		while(i.hasNext())
		{
			LineItem item=i.next();
			System.out.println(item);
			
		}
		
		

	}

}
