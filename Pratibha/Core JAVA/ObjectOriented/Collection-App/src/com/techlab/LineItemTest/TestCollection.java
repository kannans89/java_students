package com.techlab.LineItemTest;

import java.util.*;

import com.techlab.LineItem.LineItem;

public class TestCollection {
	public static void main(String[] args) {
		List car;
		car=new ArrayList();
		car.add(new LineItem(1,"apple",5,20));
		car.add(new LineItem(2,"orange",4,4));
		car.add("Hellow");
		for(Object item:car){
			LineItem temp=(LineItem) item;
			System.out.println(temp.calculateTotalPrice());
		}
	}
}
