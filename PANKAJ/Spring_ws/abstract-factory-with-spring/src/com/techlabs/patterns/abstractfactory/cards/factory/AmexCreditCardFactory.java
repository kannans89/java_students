package com.techlabs.patterns.abstractfactory.cards.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.patterns.abstractfactory.cards.AmexGoldCreditCard;
import com.techlabs.patterns.abstractfactory.cards.AmexGoldValidator;
import com.techlabs.patterns.abstractfactory.cards.AmexPlatinumCreditCard;
import com.techlabs.patterns.abstractfactory.cards.AmexPlatinumValidator;
import com.techlabs.patterns.abstractfactory.cards.CreditCard;
import com.techlabs.patterns.abstractfactory.cards.CreditCardType;
import com.techlabs.patterns.abstractfactory.cards.IValidator;

public class AmexCreditCardFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CreditCardType type) {
		ApplicationContext app = new ClassPathXmlApplicationContext(
				"Amex Card Beans.xml");
		if (type == CreditCardType.GOLD)
			return app.getBean("AmexGoldCC", AmexGoldCreditCard.class);
		else
			return app.getBean("AmexPlatinumCC", AmexPlatinumCreditCard.class);
	}

	@Override
	public IValidator getValidator(CreditCardType type) {
		ApplicationContext app = new ClassPathXmlApplicationContext(
				"Amex Validator Beans.xml");
		if (type == CreditCardType.GOLD)
			return app.getBean("AmexGoldV", AmexGoldValidator.class);
		else
			return app.getBean("AmexPlatinumV", AmexPlatinumValidator.class);
	}

}
