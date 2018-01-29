package com.techlabs.principles.dip.solution2;

public class TaxFinder {
	private double result;
	private IErrorLog log;

	public TaxFinder(IErrorLog log) {
		this.log = log;
	}

	public double calculate(int amount, int rate) {
		try {
			result = (amount / rate);
		} catch (Exception ex) {
			log.handleError(ex.getMessage());
		}
		return result;
	}
}
