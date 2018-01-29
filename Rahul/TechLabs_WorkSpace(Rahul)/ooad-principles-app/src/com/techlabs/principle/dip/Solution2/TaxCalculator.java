package com.techlabs.principle.dip.Solution2;

public class TaxCalculator {
	// Ivars
	private IErrorLog errorLog;

	// constructor
	public TaxCalculator(IErrorLog log) {
		errorLog = log;
	}

	// methods
	public double calculate(int a, int b) {
		try {
			return a / b;
		} catch (Exception ex) {
			errorLog.handleError("message :"+ex.getMessage());
		}
		return 0;
	}

}
