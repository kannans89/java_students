package com.techlabs.patterns.abstractfactory.cards;

public abstract class CreditCard {

	int no;
	int ccv;

	void setNo(int no) {
		this.no = no;
	}

	void setCcv(int ccv) {
		this.ccv = ccv;
	}
}
