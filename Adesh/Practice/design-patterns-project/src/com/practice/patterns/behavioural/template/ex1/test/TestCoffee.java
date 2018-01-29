package com.practice.patterns.behavioural.template.ex1.test;

import com.practice.patterns.behavioural.template.ex1.BruCoffee;
import com.practice.patterns.behavioural.template.ex1.NesCoffee;

public class TestCoffee {

	public static void main(String[] args) {
		System.out.println("Preparing NesCoffee");
		NesCoffee nesCoffee = new NesCoffee();
		nesCoffee.prepareCoffee();
		
		System.out.println("\nPreparing BruCoffee");
		BruCoffee bruCoffee = new BruCoffee();
		bruCoffee.prepareCoffee();
	}

}
