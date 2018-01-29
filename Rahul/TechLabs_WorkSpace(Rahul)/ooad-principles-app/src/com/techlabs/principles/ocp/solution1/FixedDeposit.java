package com.techlabs.principles.ocp.solution1;

public class FixedDeposit {
	// Instance Variables
	private int fdPrinciple;
	private int fdYears;
	private FestivalType fdFestival;

	// Constructor
	public FixedDeposit(int amount, int years, FestivalType festival) {
		fdPrinciple = amount;
		fdYears = years;
		fdFestival = festival;

	}
	

	// Methods
	public int getPrinciple(){
		return fdPrinciple;
	}
	public int getYears(){
		return fdYears;
	}
	public FestivalType getFestival(){
		return fdFestival;
	}
	
	public double calculateIntrest() {
		
		switch (fdFestival) {
		case CRISTMAS:
			return fdPrinciple * fdYears * (10.0/100);

		case DIWALI:
			return fdPrinciple * fdYears * (8.0/100);
			 

		case EID:
			return fdPrinciple * fdYears * (9.0/100);
			 
		case HOLI:
			return fdPrinciple * fdYears * (7.0/100);
			
		case NEWYEAR:
			return fdPrinciple * fdYears * (10.0/100);
			 
		case PATETI:
			return fdPrinciple * fdYears * (8.0/100);
			
		default:
			return fdPrinciple * fdYears * (6.0/100);
			

		}
	}

}
