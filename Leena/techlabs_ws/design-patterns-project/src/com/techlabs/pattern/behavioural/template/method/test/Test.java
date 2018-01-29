package com.techlabs.pattern.behavioural.template.method.test;

import com.techlabs.pattern.behavioural.template.method.BruCoffee;
import com.techlabs.pattern.behavioural.template.method.NesCafe;

public class Test {

	public static void main(String[] args) {
		
		NesCafe obj=new NesCafe();
		obj.prepareCoffee();
		System.out.println("------------------------------------------------------");
		BruCoffee obj1=new BruCoffee();
		obj1.prepareCoffee();
	}

}
