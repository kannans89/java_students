package com.techlabs.account;

import com.techlabs.account.interest.rates.IRate;

public class FixedDeposit {
	private double principal;
	private int duration;
	private IRate rate;
	
	public FixedDeposit(double principal,int duration,IRate rate){
		this.principal=principal;
		this.duration=duration;
		this.rate=rate;
	}
	
	public double calcInterest(){
		return principal*duration*rate.getRate();
	}

}
