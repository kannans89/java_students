package com.techlabs.dip.solution2;


public class TaxCalculator {

	IExceptionHandler logType;
	
	public TaxCalculator(IExceptionHandler logType) {
		this.logType=logType;
	}
	
	public double calcTax(int amt, int rate) {
		double result = 0;
		try {
			result = amt / rate;
		} catch (ArithmeticException e) {
			logType.handleError(e.getMessage());
		}
		return result;
	}
}
