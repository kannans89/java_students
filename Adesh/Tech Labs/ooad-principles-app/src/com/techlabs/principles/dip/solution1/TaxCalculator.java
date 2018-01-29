package com.techlabs.principles.dip.solution1;

public class TaxCalculator {
	private LogType type;
	private double result;

	public TaxCalculator(LogType type) {
		this.type = type;
	}

	public double calculate(int amount, int rate) {
		try {
			result = (amount / rate);
		} catch (Exception ex) {
			if (type == LogType.EMAIL) {
				new EmailErrorLog().handleError(ex.getMessage());
			} else {
				new XmlErrorLog().handleError(ex.getMessage());
			}
		}
		return result;
	}
}
