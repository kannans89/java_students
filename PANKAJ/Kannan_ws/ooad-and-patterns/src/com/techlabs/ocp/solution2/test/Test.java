package com.techlabs.ocp.solution2.test;

import com.techlabs.ocp.solution2.Christmas;
import com.techlabs.ocp.solution2.DiscountCalculator;
import com.techlabs.ocp.solution2.NewYear;
import com.techlabs.ocp.solution2.Weekday;
import com.techlabs.ocp.solution2.Weekend;

public class Test {

	public static void main(String[] args) {

		System.out.println("Price on weekday:"+DiscountCalculator.calcDiscount(100,new Weekday()));
		System.out.println("Price on weekend:"+DiscountCalculator.calcDiscount(100,new Weekend()));
		System.out.println("Price on New Year:"+DiscountCalculator.calcDiscount(100,new NewYear()));
		System.out.println("Price on Christmas:"+DiscountCalculator.calcDiscount(100,new Christmas()));
	}

}
