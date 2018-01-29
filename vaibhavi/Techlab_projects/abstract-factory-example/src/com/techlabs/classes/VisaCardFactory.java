package com.techlabs.classes;

public class VisaCardFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CreditCardType type) {
		// TODO Auto-generated method stub
		CreditCard card=null;
		if(type==CreditCardType.GOLD)
		{
			 card=new VisaGoldCreditCard();
		}
		if(type==CreditCardType.PLATINUM)
		{
			card=new VisaPlatinumCreditCard();
		}
		return card;
		
	}

	@Override
	public IValidator getValidator(CreditCardType type) {
		// TODO Auto-generated method stub
		IValidator validator=null;
		if(type==CreditCardType.GOLD)
		{
			validator=new VisaGoldValidator();
		}
		if(type==CreditCardType.PLATINUM)
		{
			validator=new VisaPlatinumValidator();
		}
		
		return validator;
		
	}

}
