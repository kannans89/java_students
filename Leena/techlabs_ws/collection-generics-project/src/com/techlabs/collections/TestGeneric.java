package com.techlabs.collections;
import java.util.ArrayList;
import java.util.List;
public class TestGeneric {
	
		public static void main(String[] args) {
			
			
			List<LineItem> myList=new ArrayList<LineItem>();
			myList.add(new LineItem(101, "Book",5,100));
			myList.add(new LineItem(102, "Pen",4,50));
			myList.add(new LineItem(103, "Pencil",1,10));
			//myList.add("Hello");
			
			//with Object class
			/*for(Object listCollector:myList){
				System.out.println(listCollector);
			}*/
			
			//with TypeCasting
			for(LineItem listCollector:myList){
				System.out.println("Id is :"+listCollector.getID()+" Total Price is :"+listCollector.getTotalprice() );
				
			}
			
			
			
		}

	}



