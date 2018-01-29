package com.techlabs.dip.solution1.test;

import com.techlabs.dip.solution1.LogType;
import com.techlabs.dip.solution1.TaxCalculator;

public class Test {

	public static void main(String[] args) {

		TaxCalculator obj = new TaxCalculator(LogType.XML);
		System.out.println(obj.calcTax(0, 0));

		obj = new TaxCalculator(LogType.EMAIL);
		System.out.println(obj.calcTax(0, 0));
	}

}
