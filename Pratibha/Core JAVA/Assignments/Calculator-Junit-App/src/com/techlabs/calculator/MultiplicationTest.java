package com.techlabs.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTest {

	@Test
	public void testmultiplication() {
		Calculator test=new Calculator();
		int result=test.multiplication(5, 4);
		assertEquals(20, result);
	}

}
