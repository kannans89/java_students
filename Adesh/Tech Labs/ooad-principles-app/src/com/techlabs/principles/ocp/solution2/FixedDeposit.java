package com.techlabs.principles.ocp.solution2;

public class FixedDeposit {

	private int principal;
	private int years;
	private IFestival festival;

	public FixedDeposit(int principal, int years, IFestival festival) {
		this.principal = principal;
		this.years = years;
		this.festival = festival;
	}

	public double calculateInterest() {

		return (principal * years * festival.getRate());
	}

}
