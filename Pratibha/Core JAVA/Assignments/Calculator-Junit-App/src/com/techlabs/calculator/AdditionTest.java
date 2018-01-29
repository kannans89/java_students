package com.techlabs.calculator;

import org.junit.Test;

public class AdditionTest {

	@Test(expected =NegativeNumberException.class)
	public void testAdd() throws  NegativeNumberException {
		new Calculator().addition(-1, -3);
		
	}
}
