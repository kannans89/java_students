package com.techlabs.patterns.creational.abstractx.factory.ex1.factory;

import com.techlabs.patterns.creational.abstractx.factory.ex1.CardType;
import com.techlabs.patterns.creational.abstractx.factory.ex1.Validations.IValidator;
import com.techlabs.patterns.creational.abstractx.factory.ex1.creditcardsfamily.CreditCardFamily;

public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(double cardScore) {
		if (cardScore <= 10000) {
			return new VisaCreditCardFactory();
		} else if (cardScore > 10000) {
			return new AmexCreditCardFactory();
		} else {
			return null;
		}
	}

	public abstract CreditCardFamily getCreditCard(CardType card);

	public abstract IValidator getValidator(CardType card);

}
