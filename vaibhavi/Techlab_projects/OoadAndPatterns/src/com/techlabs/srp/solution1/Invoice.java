package com.techlabs.srp.solution1;

public class Invoice {
	
    private double subTotal;
    private double taxRate;
    
    
    public Invoice(double subTotal,double taxRate)
    {
    	this.subTotal=subTotal;
    	this.taxRate=taxRate;
    }

    public double calculateTax()
    {
    	return (subTotal*taxRate)/100;
    }
    public double calculateTotal()
    {
    	return (subTotal+calculateTax());
    }
    
    public static void printInvoice(Invoice item)
    {
    	System.out.println(item);
    }

	@Override
	public String toString() {
		return "Invoice [subTotal=" + subTotal + ", taxRate=" + taxRate + "]";
	}
}
