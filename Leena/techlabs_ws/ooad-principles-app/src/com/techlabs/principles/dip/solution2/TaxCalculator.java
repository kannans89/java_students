package com.techlabs.principles.dip.solution2;

public class TaxCalculator {
	
	IErrorLog log;
	
	public TaxCalculator(IErrorLog log){
		this.log=log;
	}
	
	public double calculate(int income, int rate) {

		try {
			return income / rate;
		} catch (Exception e) {
			log.handleError(e.getMessage());
		}
		return 0.0;
		}

}
