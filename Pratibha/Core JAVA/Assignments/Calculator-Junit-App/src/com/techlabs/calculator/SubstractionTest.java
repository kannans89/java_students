package com.techlabs.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class SubstractionTest {

	@Test
	public void test() {
		Calculator test=new Calculator();
		int result=test.substraction(9, 7);
		assertEquals(2, result);
	}

}
