package com.techlabs.principles.dip.solution1.test;

import com.techlabs.principles.dip.solution1.LogType;
import com.techlabs.principles.dip.solution1.TaxCalculator;

public class Test {

	public static void main(String[] args) {
		
		TaxCalculator calculator=new TaxCalculator(LogType.XML);
		calculator.calculate(0, 0);
		System.out.println("====================================");
		System.out.println(" output is : "+calculator.calculate(20,5));
		System.out.println("====================================");
		TaxCalculator calc=new TaxCalculator(LogType.EMAIL);
		calc.calculate(0, 0);
	}

}
