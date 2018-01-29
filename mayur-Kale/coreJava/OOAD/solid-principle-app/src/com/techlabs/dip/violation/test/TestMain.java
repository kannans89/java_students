package com.techlabs.dip.violation.test;

import com.techlabs.dip.violation.LoggerType;
import com.techlabs.dip.violation.TaxCalculator;

public class TestMain {

	public static void main(String[] args) {
			TaxCalculator calculator = new TaxCalculator(LoggerType.EMAIL);
			calculator.calculate(0, 0);
	}

}
