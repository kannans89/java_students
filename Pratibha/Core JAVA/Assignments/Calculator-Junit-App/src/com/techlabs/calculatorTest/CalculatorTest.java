package com.techlabs.calculatorTest;

import com.techlabs.calculator.*;

public class CalculatorTest {

	public static void main(String[] args) throws Exception {
		Calculator cal = new Calculator();

		System.out.println("9-3=" + cal.substraction(9, 3));
		System.out.println("5*4=" + cal.multiplication(5, 4));
		System.out.println("5/1="+cal.division(5, 1));
		System.out.println("8/4=" + cal.division(8, 4));
		System.out.println("5+10=" + cal.addition(5, 10));
		System.out.println("-8+5=" + cal.addition(-8, 5));
	}
}
