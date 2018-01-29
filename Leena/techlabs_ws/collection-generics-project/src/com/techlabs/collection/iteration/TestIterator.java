package com.techlabs.collection.iteration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {
		List<LineItem>  myList=new ArrayList<LineItem>();
		myList.add(new LineItem(100, "Books", 5,100));
		myList.add(new LineItem(200,"Pens",2,10));
		myList.add(new LineItem(103,"Pencil",10, 5));
		
		/*Iterator<LineItem> cursor =myList.iterator();
		while(cursor.hasNext()){
			LineItem item=cursor.next();
			System.out.println("Id is :"+item.getID());
			System.out.println("Product name is :"+item.getName());
			System.out.println(cursor.hasNext());
		}
		System.out.println(cursor.hasNext());
        */
		
		for(Iterator<LineItem> cursor=myList.iterator();cursor.hasNext();){
			//cursor.next();
			LineItem item=(LineItem)cursor.next();
			System.out.println("Id is :"+item.getID());
			System.out.println("Product name is :"+item.getName());
			
		}
				
		
	}

}
