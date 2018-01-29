package com.techlabs.patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Bidder {
	
	private double bidAmount;
	List<IBidListener> listners=new ArrayList<IBidListener>();
	
	public Bidder(double bidAmount)
	{
		this.bidAmount=bidAmount;
	}
	public void addListener(IBidListener listener)
	{
		listners.add(listener);
	}
	
	public void doBid(double amount)
	{
		if(amount>bidAmount)
		{
			this.bidAmount=amount;
			NotifyAllUsers();
		}
		
		
	}
	
	private void NotifyAllUsers()
	{
		for(IBidListener listener:listners)
		{
			listener.updateBidAmount(this);
		}
	}

	public double getBidAmount() {
		return bidAmount;
	}

}
