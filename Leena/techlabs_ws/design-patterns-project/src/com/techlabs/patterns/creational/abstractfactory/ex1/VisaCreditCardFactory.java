package com.techlabs.patterns.creational.abstractfactory.ex1;

public class VisaCreditCardFactory extends CreditCardFactory{

	@Override
public CreditCard getCreditCard(CardType type){
	if(type.equals(CardType.GOLD)){
		return new VisaGoldCreditCard();
	}
	return new VisaPlatinumCreditCard();
}
	@Override
	public IValidator getValidator(CardType type){
		if(type.equals(CardType.GOLD)){
			return new VisaGoldValidator();
		}
		return new VisaPlatinumValidator();
	}

}
