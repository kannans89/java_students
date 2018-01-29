package com.practice.patterns.structural.decorator.ex1.test;

import com.practice.patterns.structural.decorator.ex1.ISandwich;
import com.practice.patterns.structural.decorator.ex1.MeatDecorator;
import com.practice.patterns.structural.decorator.ex1.SauceDecorator;
import com.practice.patterns.structural.decorator.ex1.SimpleSandwich;

public class TestSandwich {
	public static void main(String args[]){
	ISandwich mySandwich = new SauceDecorator(new MeatDecorator(new SimpleSandwich()));
	System.out.println("Here is the ordered sandwich ==> "+mySandwich.makeSandwich());
	System.out.println("Sandwich Price => "+mySandwich.getPrice());
	
}
}
