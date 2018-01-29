package com.techlabs.ocp.violation;

public class FixedDeposit {
	private final int deposit;
	private final int noOfYear;
	private final FestivalType festival;

	public FixedDeposit(int deposit, int year, FestivalType festival) {
		this.deposit = deposit;
		this.noOfYear = year;
		this.festival = festival;
	}

	public double calcTotalInterest() {
		return (noOfYear * deposit * getRate());
	}

	private double getRate() {
		if (festival == FestivalType.DIWALI)
			return 0.1;
		if (festival == FestivalType.HOLI)
			return 0.05;
		if (festival == FestivalType.NEWYEAR)
			return 0.075;
		return 0;
	}

}
