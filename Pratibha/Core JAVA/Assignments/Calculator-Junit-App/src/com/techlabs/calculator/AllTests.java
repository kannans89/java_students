package com.techlabs.calculator;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AdditionTest.class, DivitionTest.class,
		MultiplicationTest.class, SubstractionTest.class })
public class AllTests {

}

