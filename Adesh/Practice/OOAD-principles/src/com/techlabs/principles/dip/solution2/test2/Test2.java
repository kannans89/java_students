package com.techlabs.principles.dip.solution2.test2;

import com.techlabs.principles.dip.solution2.EmailErrorLogger;
import com.techlabs.principles.dip.solution2.TaxFinder;

public class Test2 {

	public static void main(String[] args) {
		
		TaxFinder calci = new TaxFinder(new EmailErrorLogger());
		calci.calculateTax(0, 0);
		System.out.println(calci);
	}

}
