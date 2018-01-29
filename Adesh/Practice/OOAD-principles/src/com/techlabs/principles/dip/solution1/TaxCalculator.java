package com.techlabs.principles.dip.solution1;

public class TaxCalculator {
	private LogType log;
	private double result;
	
	public TaxCalculator(LogType log){
		this.log = log;
	}
	
	public double calculate(int amount, int rate){
		try{
			result = (amount / rate);
		}catch(Exception ex){
			if(log == LogType.EMAIL){
				new EmailErrorLog().errorHandler(ex.getMessage());
			}else{
				new XmlErrorLog().errorHandler(ex.getMessage());
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return "TaxCalculator result = " + result;
	}

}
