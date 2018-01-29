package com.practice.patterns.creational.x.factory.ex1;

class VisaCreditCardFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType type) {
		if(type.equals(CardType.GOLD)){
			return new VisaGoldCreditCard();
		}else if(type.equals(CardType.PLATINUM)){
			return new VisaPlatinumCreditCard();
		}else return null;
	}

	@Override
	public IValidator getValidtor(CardType type) {
		if(type.equals(CardType.GOLD)){
			return new VisaGoldValidator();
		}else if(type.equals(CardType.PLATINUM)){
			return new VisaPlatinumValidator();
		}else return null;
	}

}
