package com.techlabs.principles.dip.solution2;

public class TaxFinder {

	private IErrorLog type;
	private double result;
	
	public TaxFinder(IErrorLog type) {
		this.type = type;
	}
	
	public double calculateTax(int amount, int rate){
		try{
			result = (amount / rate);
		}catch(Exception ex){
			type.errorHandler(ex.getMessage());
		}
		return result;
	}

	@Override
	public String toString() {
		return "TaxFinder result = " + result;
	}
}
