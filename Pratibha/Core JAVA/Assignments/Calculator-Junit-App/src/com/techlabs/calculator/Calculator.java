package com.techlabs.calculator;

public class Calculator {
	private int num1;
	private int num2;

	public int addition(int num1, int num2) throws NegativeNumberException {
		if (num1 > 0 && num2 > 0) {
			this.num1 = num1;
			this.num2 = num2;
			return (this.num1 + this.num2);
		}
		if (num1 < 0 && num2 < 0)
			throw new NegativeNumberException("Exxception occured");
		return 0;

	}

	public int substraction(int num1, int num2) {
		return num1 - num2;

	}

	public int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	public int division(int num1, int num2) {
		return num1 / num2;

	}

}
