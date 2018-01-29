package com.techlabs.principle.dip.Solution2.test;

import com.techlabs.principle.dip.Solution2.EmailErrorLog;
import com.techlabs.principle.dip.Solution2.TaxCalculator;
import com.techlabs.principle.dip.Solution2.XmlErrorLog;

public class Test {

	public static void main(String[] args) {
		TaxCalculator taxCalculator = new TaxCalculator(new XmlErrorLog());
		System.out.println(taxCalculator.calculate(0, 0));
		TaxCalculator taxCalculator2 = new TaxCalculator(new EmailErrorLog());
		taxCalculator2.calculate(0, 0);
	}

}
