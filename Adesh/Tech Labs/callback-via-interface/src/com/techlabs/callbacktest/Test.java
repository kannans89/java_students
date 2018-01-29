package com.techlabs.callbacktest;

import com.techlabs.callback.DiscountCalculator;
import com.techlabs.callback.MondayRate;

public class Test {
	public static void main(String[] args) {
		DiscountCalculator calci = new DiscountCalculator(100, "Adesh",
				new MondayRate());
		System.out.println("Amount have to pay by " + calci.getName() + " = "
				+ calci.calculate());
	}

}
