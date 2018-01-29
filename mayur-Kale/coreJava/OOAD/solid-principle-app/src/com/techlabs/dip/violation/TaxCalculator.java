package com.techlabs.dip.violation;

public class TaxCalculator {
	private LoggerType logger;
	
	
	public TaxCalculator(LoggerType logger) {
		this.logger = logger;
	}
	
	public int calculate(int income,int rate){
		int result=0;
		try{
			result = income/rate;
		}catch (Exception e) {
				if(logger == LoggerType.EMAIL)
					new  EmailLogger().log(e.getMessage());
				if(logger == LoggerType.XML)
					new  XmlLogger().log(e.getMessage());
				if(logger == LoggerType.FILE)
					new  FileLogger().log(e.getMessage());
				
		}
		
		return result;
	}
}
