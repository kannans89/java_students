package com.techlabs.patterns.behavioural.observer;

public class TestBidder {

	public static void main(String[] args) {

		Bidder bidder=new Bidder(5000);
		bidder.addListener(new Screen1());
		bidder.addListener(new Screen2());
		bidder.doBid(6000);
	}

}
