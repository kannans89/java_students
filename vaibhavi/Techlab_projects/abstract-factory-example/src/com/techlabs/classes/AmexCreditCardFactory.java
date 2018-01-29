package com.techlabs.classes;

public class AmexCreditCardFactory extends CreditCardFactory{

	@Override
	public CreditCard getCreditCard(CreditCardType type) {
		// TODO Auto-generated method stub
		CreditCard card=null;
		if(type==CreditCardType.GOLD)
		{
			 card=new AmexGoldCreditCard();
		}
		if(type==CreditCardType.PLATINUM)
		{
			card=new AmexPlatinumCreditCard();
		}
		return card;
	}

	@Override
	public IValidator getValidator(CreditCardType type) {
		// TODO Auto-generated method stub
		IValidator validator=null;
		if(type==CreditCardType.GOLD)
		{
			validator=new AmexGoldValidator();
		}
		if(type==CreditCardType.PLATINUM)
		{
			validator=new AmexPlatinumValidator();
		}
		
		return validator;
	}

}
