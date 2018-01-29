package com.techlabs.dip.solution1;

public class TaxCalculator {
 
	int num1;
	int num2;
	String flag;
	
	
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
		   if(flag=="mail")
		   {
			   MailExceptionHandler handler=new MailExceptionHandler(ex.getMessage());
			   handler.handleError();
			   
		   }
		   if(flag=="xml")
		   {
			   XmlFileException handler=new XmlFileException(ex.getMessage());
			   handler.handleError();
		   }
		}
		
		return result;
	}

	public String getFlag() {
		return flag;
	}
	
	public void setFlag(String flag)
	{
		this.flag=flag;
	}
}
