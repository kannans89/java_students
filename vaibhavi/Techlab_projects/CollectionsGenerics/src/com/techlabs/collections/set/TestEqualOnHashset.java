package com.techlabs.collections.set;

import java.util.HashSet;

import com.techlabs.collections.old.LineItem;

public class TestEqualOnHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<LineItem> listitems=new HashSet<LineItem>();
		listitems.add(new LineItem("Books",2,5,500));
		listitems.add(new LineItem("notebook",2,6,50));
		listitems.add(new LineItem("laptop", 3, 1, 50000));
		
		for(LineItem items:listitems)
		{
			System.out.println("Distinct list items are" +items.getName());
			
		}
		
		

	}

}
