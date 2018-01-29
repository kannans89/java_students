package com.techlabs.patterns.behavioural.observer;

public class Screen2 implements IBidListener {

	@Override
	public void updateBidAmount(Bidder bidder) {
		System.out.println("Wait Screen1 is Updating");
		System.out.println("Bid amount is  :" +bidder.getBidAmount());
		
	}

}
