package com.techlabs.dip.solution2;

public class TaxCalculator {

	IErrorHandler handler;
	int num1;
	int num2;
	
	public TaxCalculator(IErrorHandler handler)
	{
		this.handler=handler;
	}
	public int divide(int num1,int num2) 
	{
		this.num1=num1;
		this.num2=num2;
		int result=0;
		try
		{
		  result=num1/num2;
		}
		catch(Exception ex)
		{
			handler.handleError();
		}
		return result;
	}
}
