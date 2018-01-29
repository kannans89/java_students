package com.techlabs.patterns.behavioral.observer.bid;

import java.util.ArrayList;
import java.util.List;

public class Bidder {
	
	double bidAmount;
	List<IbidListners> listOflistners;
	
	public Bidder(int bidAmount){
		this.bidAmount=bidAmount;
		listOflistners=new ArrayList<IbidListners>();
	}
	
	public void addListners(IbidListners listner){
		listOflistners.add(listner);
	}
	
	void notifyListners(){
		for(IbidListners listner:listOflistners)
			listner.updateBidAmount(this);
	}
	
	public void updateBid(int bidAmount){
		if(this.bidAmount<bidAmount){
			this.bidAmount=bidAmount;
			notifyListners();
		}
	}
	
	public double getBidAmount(){
		return bidAmount;
	}
}
