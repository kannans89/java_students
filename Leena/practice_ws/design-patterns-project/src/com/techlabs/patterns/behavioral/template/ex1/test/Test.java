package com.techlabs.patterns.behavioral.template.ex1.test;

import com.techlabs.patterns.behavioral.template.ex1.GlassHouse;
import com.techlabs.patterns.behavioral.template.ex1.WoodenHouse;

public class Test {

	public static void main(String[] args) {
		
		WoodenHouse woodenhouse=new WoodenHouse();
		woodenhouse.buildFoundation();
		woodenhouse.buildPillars();
		woodenhouse.buildWalls();
		woodenhouse.buildWindows();
		System.out.println("House is Built....");
		
		System.out.println("----------------------------------------------------------------------");
		
		GlassHouse glasshouse=new  GlassHouse();
		glasshouse.buildFoundation();
		glasshouse.buildPillars();
		glasshouse.buildWalls();
		glasshouse.buildWindows();
		System.out.println("House is built....");
	}

}
