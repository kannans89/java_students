package com.techlabs.dip.solution2;

public class Test {

	public static void main(String[] args) {

		IErrorHandler handler=new MailExceptionHandler();
		TaxCalculator calc=new TaxCalculator(handler);
		System.out.println(calc.divide(10, 0));
	}

}
