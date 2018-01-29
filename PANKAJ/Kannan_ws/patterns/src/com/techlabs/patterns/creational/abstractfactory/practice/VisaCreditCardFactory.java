package com.techlabs.patterns.creational.abstractfactory.practice;

public class VisaCreditCardFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CreditCardType type) {
		if (type == CreditCardType.GOLD)
			return new VisaGoldCreditCard();
		else
			return new VisaPlatinumCreditCard();
	}

	@Override
	public IValidator getValidator(CreditCardType type) {
		if (type == CreditCardType.GOLD)
			return new VisaGoldValidator();
		else
			return new VisaPlatinumValidator();
	}

}
