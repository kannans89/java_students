package com.techlabs.patterns.behavioral.template.test;

import com.techlabs.patterns.behavioral.template.Bru;
import com.techlabs.patterns.behavioral.template.CoffeeTemplate;
import com.techlabs.patterns.behavioral.template.Nescafe;

public class Test {

	public static void main(String[] args) {

		CoffeeTemplate coffee=new Nescafe();
		coffee.prepareCoffee();
		
		coffee=new Bru();
		coffee.prepareCoffee();
	}

}
