package com.techlabs.patterns.behavioral.strategy.test;

import com.techlabs.patterns.behavioral.strategy.HighDiscount;
import com.techlabs.patterns.behavioral.strategy.Invoice;
import com.techlabs.patterns.behavioral.strategy.LowDiscount;
import com.techlabs.patterns.behavioral.strategy.NormalDiscount;

public class Test {

	public static void main(String[] args) {

		Invoice inv=new Invoice(100,new HighDiscount());
		System.out.println(inv.calcTotal());
		
		inv=new Invoice(100, new NormalDiscount());
		System.out.println(inv.calcTotal());
		
		inv=new Invoice(100, new LowDiscount());
		System.out.println(inv.calcTotal());
	}

}
