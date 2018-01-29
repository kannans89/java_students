package com.techlabs.patterns.structural.decorator.ex1.test;

import com.techlabs.patterns.structural.decorator.ex11.ISandwich;
import com.techlabs.patterns.structural.decorator.ex11.MeatDecorator;
import com.techlabs.patterns.structural.decorator.ex11.SauceDecorator;
import com.techlabs.patterns.structural.decorator.ex11.SimpleSandwich;

public class TestSandwich {

	public static void main(String[] args) {
		ISandwich mySandwich = new SauceDecorator(new MeatDecorator(new SimpleSandwich()));
		System.out.println("Here is the your Orderd Sandwich==> \n"+mySandwich.makeSandwich());
		System.out.println("Total Cost = "+mySandwich.getPrice());
	}

}
