package com.techlabs.patterns.creational.abstractx.factory.ex1.factory;

import com.techlabs.patterns.creational.abstractx.factory.ex1.CardType;
import com.techlabs.patterns.creational.abstractx.factory.ex1.Validations.AmexGoldValidator;
import com.techlabs.patterns.creational.abstractx.factory.ex1.Validations.AmexPlatinumValidator;
import com.techlabs.patterns.creational.abstractx.factory.ex1.Validations.IValidator;
import com.techlabs.patterns.creational.abstractx.factory.ex1.creditcardsfamily.AmexGoldCreditCard;
import com.techlabs.patterns.creational.abstractx.factory.ex1.creditcardsfamily.AmexPlatinumCreditCard;
import com.techlabs.patterns.creational.abstractx.factory.ex1.creditcardsfamily.CreditCardFamily;

public class AmexCreditCardFactory extends CreditCardFactory {

	@Override
	public CreditCardFamily getCreditCard(CardType card) {
		switch (card) {
		case GOLD:
			return new AmexGoldCreditCard();
		case PLATINUM:
			return new AmexPlatinumCreditCard();
		default:
			return null;
		}
	}

	@Override
	public IValidator getValidator(CardType card) {
		switch (card) {
		case GOLD:
			return new AmexGoldValidator();
		case PLATINUM:
			return new AmexPlatinumValidator();
		default:
			return null;
		}
	}

}
