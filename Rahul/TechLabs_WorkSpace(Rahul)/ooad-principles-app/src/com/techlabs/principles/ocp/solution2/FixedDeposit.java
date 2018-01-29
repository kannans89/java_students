package com.techlabs.principles.ocp.solution2;

public class FixedDeposit {
	//Instance Variables
	private int fdPrinciple;
	private int fdYears;
	private IFestivalRate fdFestival;
	
	//constructor
	public FixedDeposit(int principle,int years,IFestivalRate festival){
		fdPrinciple=principle;
		fdYears =years;
		fdFestival=festival;
		
	}
	public double getPrinciple(){
		return fdPrinciple;
	}
	public double getYears(){
		return fdYears;
	}
	
	
	//methods
	public double calculateIntrest(){
		return (getPrinciple()*getYears()* (fdFestival.getRateOfIntrest()));
	}

}
