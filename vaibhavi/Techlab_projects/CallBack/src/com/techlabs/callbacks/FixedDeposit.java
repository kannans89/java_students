package com.techlabs.callbacks;

public class FixedDeposit {

	private double principal;
	private int duration;
	private IRate rate;
	
	public FixedDeposit(double principal,int duration,IRate rate)
	{
		this.principal=principal;
		this.duration=duration;
		this.rate=rate;
	}
	
	public double calculateInterest()
	{ 
		return principal*duration*rate.getRate();
		
	}
	
}
