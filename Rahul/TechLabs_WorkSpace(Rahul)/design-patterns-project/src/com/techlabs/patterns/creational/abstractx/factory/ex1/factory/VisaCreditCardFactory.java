package com.techlabs.patterns.creational.abstractx.factory.ex1.factory;

import com.techlabs.patterns.creational.abstractx.factory.ex1.CardType;
import com.techlabs.patterns.creational.abstractx.factory.ex1.Validations.IValidator;
import com.techlabs.patterns.creational.abstractx.factory.ex1.Validations.VisaGoldValidator;
import com.techlabs.patterns.creational.abstractx.factory.ex1.Validations.VisaPlatinumValidator;
import com.techlabs.patterns.creational.abstractx.factory.ex1.creditcardsfamily.CreditCardFamily;
import com.techlabs.patterns.creational.abstractx.factory.ex1.creditcardsfamily.VisaGoldCreditCard;
import com.techlabs.patterns.creational.abstractx.factory.ex1.creditcardsfamily.VisaPlatinumCreditCard;

public class VisaCreditCardFactory extends CreditCardFactory {

	@Override
	public CreditCardFamily getCreditCard(CardType card) {

		switch (card) {
		case GOLD:
		 return	new VisaGoldCreditCard();
			
		case PLATINUM:
			return new VisaPlatinumCreditCard();
		default:
			return null;
		}
	}

	@Override
	public IValidator getValidator(CardType card) {
		switch (card) {
		case GOLD:
			return new VisaGoldValidator();

		case PLATINUM:
			return new VisaPlatinumValidator();

		default:
			return null;

		}
	}

}
