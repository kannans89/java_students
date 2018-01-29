package com.techlabs.principles.dip.solution1.test;

import com.techlabs.principles.dip.solution1.LogType;
import com.techlabs.principles.dip.solution1.TaxCalculator;

public class Test {

	public static void main(String[] args) {
		
		TaxCalculator calci = new TaxCalculator(LogType.EMAIL);
		calci.calculate(0, 0);
		System.out.println(calci);
	}

}
