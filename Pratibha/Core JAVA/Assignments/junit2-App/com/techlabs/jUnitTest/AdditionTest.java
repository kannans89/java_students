package com.techlabs.jUnitTest;

import static org.junit.Assert.*;


import org.junit.Test;

public class AdditionTest {

	@Test
	public void test() {
		Calculator test = new Calculator();
		double result = 0;
		result = test.addition(3, 4);
		assertEquals(7, result);
	
	}

}
