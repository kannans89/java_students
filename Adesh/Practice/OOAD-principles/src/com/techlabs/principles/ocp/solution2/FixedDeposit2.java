package com.techlabs.principles.ocp.solution2;

public class FixedDeposit2 {
	private double principal;
	private int years;
	private IFestivalType festival;

		public FixedDeposit2(double principal, int years, IFestivalType festival) {
			this.principal = principal;
			this.years = years;
			this.festival = festival;
		}

		public double calculateRateOfInterest() {
			return (principal * years * festival.getRate());
		}
		
	}


