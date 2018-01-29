package com.techlabs.principle.dip.Solution1.test;

import com.techlabs.principle.dip.Solution1.TaxCalculator;
import com.techlabs.principle.dip.Solution1.logtype.LogType;

public class Test {

	public static void main(String[] args) {
		TaxCalculator taxCalculator = new TaxCalculator(LogType.EMAIL_ERROR_LOG);
		System.out.println(taxCalculator.calculate(0, 0));
		TaxCalculator taxCalculator1 = new TaxCalculator(LogType.XML_ERROR_LOG);
		System.out.println(taxCalculator1.calculate(0, 0));
		TaxCalculator taxCalculator2 = new TaxCalculator(LogType.EMAIL_ERROR_LOG);
		System.out.println(taxCalculator2.calculate(4, 2));
	}

}
