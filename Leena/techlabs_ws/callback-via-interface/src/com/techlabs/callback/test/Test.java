package com.techlabs.callback.test;
import com.techlabs.callback.DiscountCalculator;
import com.techlabs.callback.MondayRate;
import com.techlabs.callback.TuesdayRate;

public class Test {

	public static void main(String[] args) {
		
		DiscountCalculator calc1=new DiscountCalculator(100,"Half_Girlfriend",new MondayRate());
		DiscountCalculator calc2=new DiscountCalculator(100,"Love_Story",new TuesdayRate());
		claculatePayableAmount(calc1);
		claculatePayableAmount(calc2);
	}
	
	public static void claculatePayableAmount(DiscountCalculator obj){
		System.out.println("Original Amount of "+obj.getProductName()+"is : "+obj.getBalance());
		System.out.println("But Payable amount is :  "+obj.calculate());
		System.out.println("===================================================================");
	}

}
