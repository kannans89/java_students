package com.techlabs.patterns.abstractfactory.cards.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.patterns.abstractfactory.cards.CreditCard;
import com.techlabs.patterns.abstractfactory.cards.CreditCardType;
import com.techlabs.patterns.abstractfactory.cards.IValidator;

public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		ApplicationContext app = new ClassPathXmlApplicationContext(
				"Credit Card Beans.xml");
		if (creditScore >= 1000)
			return app.getBean("AmexCCF", AmexCreditCardFactory.class);
		else
			return app.getBean("VisaCCF", VisaCreditCardFactory.class);
	}

	public abstract CreditCard getCreditCard(CreditCardType type);

	public abstract IValidator getValidator(CreditCardType type);
}
