package com.techlab.LineItemTest;

import java.util.ArrayList;
import java.util.List;

import com.techlab.LineItem.LineItem;

public class TestGeneric {

	public static void main(String[] args) {
		List <LineItem>car;
		car=new ArrayList<LineItem>();
		car.add(new LineItem(1,"apple",5,20));
		car.add(new LineItem(2,"orange",4,4));
		//car.add("Hellow");
		for(Object item:car){
			LineItem temp=(LineItem) item;
			System.out.println(temp.calculateTotalPrice());
		}

	}

}
