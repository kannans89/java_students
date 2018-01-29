package com.techlabs.patterns.creational.abstractfactory.practice;

public class AmexCreditCardFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CreditCardType type) {
		if (type == CreditCardType.GOLD)
			return new AmexGoldCreditCard();
		else
			return new AmexPlatinumCreditCard();
	}

	@Override
	public IValidator getValidator(CreditCardType type) {
		if (type == CreditCardType.GOLD)
			return new AmexGoldValidator();
		else
			return new AmexPlatinumValidator();
	}

}
