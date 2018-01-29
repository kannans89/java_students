package com.techlabs.collections.invoice;

public class LineItem {
	private String name;
	private int id;
	private int qty;
	private int unitPrice;

	public LineItem(String name, int id, int qty, int unitPrice) {
		this.name = name;
		this.id = id;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}

	public double calcTotalPrice() {
		return qty * unitPrice;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "LineItem [name=" + name + ", id=" + id + ", qty=" + qty
				+ ", unitPrice=" + unitPrice + "]";
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		LineItem item=(LineItem)obj;
		if(this.id==item.id)
			return true;
		return false;
	}
	
}
