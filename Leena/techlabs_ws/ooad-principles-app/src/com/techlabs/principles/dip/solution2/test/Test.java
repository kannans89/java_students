package com.techlabs.principles.dip.solution2.test;
import com.techlabs.principles.dip.solution2.EmailErrorLog;
import com.techlabs.principles.dip.solution2.TaxCalculator;
import com.techlabs.principles.dip.solution2.XMLErrorLog;

public class Test {

	public static void main(String[] args) {
		
		TaxCalculator calc=new TaxCalculator(new XMLErrorLog());
		calc.calculate(0, 0);
		System.out.println("---------------------");
		
		TaxCalculator calc2=new TaxCalculator(new EmailErrorLog());
		calc2.calculate(0, 0);
		System.out.println("----------------------");
		
		
	}

}
