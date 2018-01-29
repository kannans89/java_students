package com.techlabs.principles.ocp.solution1;

public class FixedDeposit {
	private int principal;
	private int years;
	private FestivalType festival;
	private int rate;

	public FixedDeposit(int principal, int years, FestivalType festival) {
		this.principal = principal;
		this.years = years;
		this.festival = festival;
	}

	public double calculateInterest() {
		if (festival == FestivalType.DIWALI) {
			rate = 8;
		} else if (festival == FestivalType.EID) {
			rate = 5;
		} else if (festival == FestivalType.GANPATI) {
			rate = 3;
		} else {
			rate = 6;
		}
		return (principal * rate * years) / 100;
	}

	public int getRate() {
		return rate;
	}

}
