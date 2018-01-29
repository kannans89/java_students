package com.techlabs.principles.dip.solution2.test2;

import com.techlabs.principles.dip.solution2.TaxFinder;
import com.techlabs.principles.dip.solution2.XmlErrorLogger;

public class Test2 {

	public static void main(String[] args) {
		
		// TaxFinder calci = new TaxFinder(new EmailErrorLogger());
		TaxFinder calci = new TaxFinder(new XmlErrorLogger());
		System.out.println("Tax = " + calci.calculate(0, 0));
	}

}
