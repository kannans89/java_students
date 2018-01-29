package com.techlabs.patterns.behavioral.observer.bid.test;

import com.techlabs.patterns.behavioral.observer.bid.Bidder;
import com.techlabs.patterns.behavioral.observer.bid.Screen;

public class Test {

	public static void main(String[] args) {

		Bidder bid=new Bidder(50);
		
		bid.addListners(new Screen("1"));
		bid.addListners(new Screen("2"));
		
		bid.updateBid(100);
		bid.updateBid(200);
	}

}
