package com.techlabs.dip.solution1;

public class TaxCalculator {

	LogType logTo;

	public TaxCalculator(LogType logTo) {
		this.logTo = logTo;
	}

	public double calcTax(int amt, int rate) {
		double result = 0;
		try {
			result = amt / rate;
		} catch (ArithmeticException e) {
			if (this.logTo == LogType.EMAIL)
				new EmailExceptionHandling().handleError(e.getMessage());
			else if (this.logTo == LogType.XML)
				new XmlFileExceptionHandling().handleError(e.getMessage());
		}
		return result;
	}
}
