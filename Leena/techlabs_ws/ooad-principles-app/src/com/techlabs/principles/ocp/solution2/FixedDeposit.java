package com.techlabs.principles.ocp.solution2;

public class FixedDeposit {
	
	private String customer;
	private double principal;
	private int noOfyears;
	private IFestivlesType festival;
	
	public FixedDeposit(String name,int amount, int years,IFestivlesType festival) {
		this.principal=amount;
		this.noOfyears=years;
		this.festival=festival;
		this.customer=name;
		
	}
	
	public double calculateInterest(){
		return principal*noOfyears*(festival.getRate());
	}
	
	public double getrate(){
		return festival.getRate();
	}
	
	public int getYears(){
		return noOfyears;
	}
	
	public String getName(){
		return customer;
	}
	public double getPrincipal(){
		return principal;
	}
}
