package com.techlabs.ocp.refactored;

public class FixedDeposit {
	private final int deposit;
	private final int noOfYear;
	private final IFestivalRate festival;

	public FixedDeposit(int deposit, int year, IFestivalRate festival) {
		this.deposit = deposit;
		this.noOfYear = year;
		this.festival = festival;
	}

	public double calcTotalInterest() {
		return (noOfYear * deposit * festival.getRate());
	}

}
