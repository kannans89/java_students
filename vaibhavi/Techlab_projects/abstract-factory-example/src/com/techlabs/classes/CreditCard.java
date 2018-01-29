package com.techlabs.classes;

public abstract class CreditCard {
	
	private int card_no;
	private int cvv_no;
	
	public int getCard_no() {
		return card_no;
	}
	public void setCard_no(int card_no) {
		this.card_no = card_no;
	}
	public int getCvv_no() {
		return cvv_no;
	}
	public void setCvv_no(int cvv_no) {
		this.cvv_no = cvv_no;
	}

}
