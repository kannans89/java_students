package com.techlabs.Test;

import com.techlabs.stretagyPattern.Context;
import com.techlabs.stretagyPattern.OperationAdd;
import com.techlabs.stretagyPattern.OperationMultiply;
import com.techlabs.stretagyPattern.OperationSubstract;

public class StrategyPatternTest {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}