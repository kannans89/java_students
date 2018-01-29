package com.techlabs.patterns.behavioural.template.ex1.test;

import com.techlabs.patterns.behavioural.template.ex1.BruCoffee;
import com.techlabs.patterns.behavioural.template.ex1.NessCoffee;

public class CoffeeTest {

	public static void main(String[] args) {
		System.out.println("Preparing NesCoffee....");
		NessCoffee nesCoffee = new NessCoffee();
		nesCoffee.prepareCoffee();
		
		System.out.println("\nPreparing BruCoffee...");
		BruCoffee brucoffee = new BruCoffee();
		brucoffee.prepareCoffee();
	}

}
