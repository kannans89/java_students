package com.techlabs.dip.solution2.test;

import com.techlabs.dip.solution2.TaxCalculator;
import com.techlabs.dip.solution2.EmailExceptionHandler;
import com.techlabs.dip.solution2.XmlFileExceptionHandler;

public class Test {

	public static void main(String[] args) {

		TaxCalculator calc=new TaxCalculator(new EmailExceptionHandler());
		System.out.println(calc.calcTax(1, 0));
		
		calc=new TaxCalculator(new XmlFileExceptionHandler());
		System.out.println(calc.calcTax(1, 0));
	}

}
