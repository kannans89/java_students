package com.techlabs.callback.test;

import com.techlabs.callback.DiscountCalculator;
import com.techlabs.callback.MondayDiscountRate;
import com.techlabs.callback.TuesdayDiscountRate;

public class DiscountCalculatorTest {

	public static void main(String[] args) {
		DiscountCalculator discount1 = new DiscountCalculator(25000, "Sony", new MondayDiscountRate());
		DiscountCalculator discount2 = new DiscountCalculator(25000, "Samsung", new TuesdayDiscountRate());
		
		print(discount1);
		print(discount2);
	}
	public static void print(DiscountCalculator discountObj){
		System.out.println("Product Name :- "+discountObj.getProductName());
		System.out.println("Discount :- "+discountObj.calculateDiscount());
		System.out.println("Amount to Pay :-"+discountObj.payableAmount());
	}

}
