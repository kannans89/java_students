package com.techlabs.patterns.structural.decorator.ex1.test;

import com.techlabs.patterns.structural.decorator.ex1.ISandwitch;
import com.techlabs.patterns.structural.decorator.ex1.SauceDecorator;
import com.techlabs.patterns.structural.decorator.ex1.SimpleSandwitch;
import com.techlabs.patterns.structural.decorator.ex1.VegDecorator;

public class Test {
	
	public static void main(String[] args){
		ISandwitch mySandwitch=new SauceDecorator(new VegDecorator(new SimpleSandwitch()));
		System.out.println(mySandwitch.makeSandwitch());
		System.out.println("Your Sandwitch is ready");
		System.out.println(" Total price of ur Sandwitch is :"+mySandwitch.getPrice());
		}

}
