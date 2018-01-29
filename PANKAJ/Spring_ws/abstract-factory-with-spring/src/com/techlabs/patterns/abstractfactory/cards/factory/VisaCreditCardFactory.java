package com.techlabs.patterns.abstractfactory.cards.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.patterns.abstractfactory.cards.CreditCard;
import com.techlabs.patterns.abstractfactory.cards.CreditCardType;
import com.techlabs.patterns.abstractfactory.cards.IValidator;
import com.techlabs.patterns.abstractfactory.cards.VisaGoldCreditCard;
import com.techlabs.patterns.abstractfactory.cards.VisaGoldValidator;
import com.techlabs.patterns.abstractfactory.cards.VisaPlatinumCreditCard;
import com.techlabs.patterns.abstractfactory.cards.VisaPlatinumValidator;

public class VisaCreditCardFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CreditCardType type) {
		ApplicationContext app = new ClassPathXmlApplicationContext(
				"Visa Card Beans.xml");
		if (type == CreditCardType.GOLD)
			return app.getBean("VisaGoldCC", VisaGoldCreditCard.class);
		else
			return app.getBean("VisaPlatinumCC", VisaPlatinumCreditCard.class);
	}

	@Override
	public IValidator getValidator(CreditCardType type) {
		ApplicationContext app = new ClassPathXmlApplicationContext(
				"Visa Validator Beans.xml");
		if (type == CreditCardType.GOLD)
			return app.getBean("VisaGoldV", VisaGoldValidator.class);
		else
			return app.getBean("VisaPlatinumV", VisaPlatinumValidator.class);
	}

}
