package com.techlabs.ocp.solution1;

public class DiscountCalculator {

	public double calcDiscount(double amt, RuleType rule) {
		if (rule == RuleType.WEEKDAY)
			return amt - amt * 0.3;
		else if (rule == RuleType.WEEKEND)
			return amt - amt * 0.15;
		else if (rule == RuleType.NEWYEAR)
			return amt - amt * 0.4;
		return 0;
	}
}
