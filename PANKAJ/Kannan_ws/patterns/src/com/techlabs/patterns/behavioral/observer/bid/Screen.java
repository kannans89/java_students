package com.techlabs.patterns.behavioral.observer.bid;

public class Screen implements IbidListners {

	String name;

	public Screen(String name) {
		super();
		this.name = name;
	}

	@Override
	public void updateBidAmount(Bidder bid) {
		System.out.println("Updating on Screen:" + name + " Bid:"
				+ bid.getBidAmount());
	}

}
