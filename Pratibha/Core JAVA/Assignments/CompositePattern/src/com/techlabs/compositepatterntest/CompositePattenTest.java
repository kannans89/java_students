package com.techlabs.compositepatterntest;

import com.techlabs.compositepattern.*;

public class CompositePattenTest {
	public static void main(String[] args) {
		CompositeEmployee CEO = new CompositeEmployee("John", "CEO", 30000);
		CompositeEmployee headSales = new CompositeEmployee("Robert", "Head Sales", 20000);
		CompositeEmployee headMarketing = new CompositeEmployee("Michel", "Head Marketing", 20000);
		CompositeEmployee clerk1 = new CompositeEmployee("Laura", "Marketing", 10000);
		CompositeEmployee clerk2 = new CompositeEmployee("Bob", "Marketing", 10000);
		CompositeEmployee salesExecutive1 = new CompositeEmployee("Richard", "Sales", 10000);
		CompositeEmployee salesExecutive2 = new CompositeEmployee("Rob", "Sales", 10000);
		CEO.add(headSales);
		CEO.add(headMarketing);
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		System.out.println(CEO);
		for (CompositeEmployee headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);
			for (CompositeEmployee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}
}
