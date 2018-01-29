package com.techlabs.patterns.behavioral.template.ex2.test;
import com.techlabs.patterns.behavioral.template.ex2.GlassHouse;
import com.techlabs.patterns.behavioral.template.ex2.HouseTemplate;
import com.techlabs.patterns.behavioral.template.ex2.WoodenHouse;

public class Test {

	public static void main(String[] args) {
		HouseTemplate glasshouse= new GlassHouse();
		glasshouse.buildHouse();
		
		HouseTemplate woodenhouse=new WoodenHouse();
		woodenhouse.buildHouse();
		
			
	
	}
}
