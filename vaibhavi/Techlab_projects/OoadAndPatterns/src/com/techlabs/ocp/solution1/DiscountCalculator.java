package com.techlabs.ocp.solution1;


public class DiscountCalculator {
	
	public double calculateDiscount(double amount,RuleType rule)
	{
		if(rule==RuleType.WEEKDAY)
		{
			return (amount*30)/100;
		}
		else if(rule==RuleType.WEEKEND)
		{
			return (amount*40)/100;
		}
		
		else
		{
			 return (amount*15)/100;
		}
		 
	}


}
