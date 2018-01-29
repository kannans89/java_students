package com.techlabs.principles.ocp.solution1;

public class FixedDeposit {
	private double principal;
	private int years;
	private FestivalType festival;
	private double rate;

	public FixedDeposit(double principal, int years, FestivalType festival) {
		this.principal = principal;
		this.years = years;
		this.festival = festival;
	}

	public double calculateRateOfInterest() {
		if (festival == FestivalType.DIWALI) {
			 rate = 0.08;
		} else if (festival == FestivalType.GANPATI) {
			 rate = 0.05;
		} else if (festival == festival.NEW_YEAR) {
			 rate = 0.03;
		}
		return (principal * years * rate);
	}
	
	public double getRate(){
		return rate;
	}

}
