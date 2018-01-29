package com.techlabs.patterns.creational.abstractfactory.ex1;

public class AmexCreditCardFactory extends CreditCardFactory{
	
	@Override
public CreditCard getCreditCard(CardType type){
		
	if(type.equals(CardType.GOLD)){
		return new AmexGoldCreditCard();
	}
	return new AmexPlatinumCreditCard();
}
	@Override
	public IValidator getValidator(CardType type){
		if(type.equals(CardType.GOLD)){
			return new AmexGoldValidator();
		}
		return new AmexPlatinumValidator();
	}


}
