package com.practice.callbacktest;

import com.practice.callback.DiscountCalculator;
import com.practice.callback.TuesdayRate;

public class Test {

	public static void main(String[] args) {
		TuesdayRate tuesday = new TuesdayRate();
		DiscountCalculator calci = new DiscountCalculator(100, "adesh", tuesday);
		System.out.println("Amount has to pay by " + calci.getName() + " = "
				+ calci.calculate(tuesday));
	}

}
