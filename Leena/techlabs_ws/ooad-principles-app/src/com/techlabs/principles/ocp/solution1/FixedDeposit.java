package com.techlabs.principles.ocp.solution1;


public class FixedDeposit {
	
	private int principal;
	private int years;
	public double rate;
	private FestivalsType festivals;
	
	
	public FixedDeposit(int principal,int years, FestivalsType festival){
		this.principal=principal;
		this.years=years;
		this.festivals=festival;
	}
	
	public double calculateInterest(){
		
		if(festivals==festivals.DIWALI){
			rate=8;
		}
		else if(festivals==festivals.HOLI){
			rate=10;
		}
		else if(festivals==festivals.EID){
			rate=12;
		}
		else if(festivals==festivals.NEWYEAR){
			rate=20;
		}
		
		return (principal*years*(rate/100));
	}
	
	public double getRate(){
		return rate;
	}
}
