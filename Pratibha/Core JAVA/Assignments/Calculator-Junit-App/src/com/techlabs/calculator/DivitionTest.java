package com.techlabs.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivitionTest {

	@Test
	public void testDivition() {
	Calculator test=new Calculator();
	int result=test.division(8, 4);
	assertEquals(2, result);
	
	}

}
