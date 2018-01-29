package com.techlabs.dip.refactored;

public class TaxCalculator {
	private ILogger logger;

	public TaxCalculator(ILogger logger) {
		this.logger = logger;
	}

	public int calculate(int income, int rate) {
		int result = 0;
		try {
			result = income / rate;
		} catch (Exception e) {
			logger.log(e.getMessage());

		}

		return result;
	}
}
