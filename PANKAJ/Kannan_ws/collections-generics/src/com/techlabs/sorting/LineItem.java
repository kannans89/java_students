package com.techlabs.sorting;

public class LineItem implements Comparable<LineItem>{
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "LineItem [name=" + name + ", id=" + id + ", qty=" + qty
				+ ", unitPrice=" + unitPrice + "]\n";
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		LineItem item = (LineItem) obj;
		if (this.id == item.id)
			return true;
		return false;
	}
	
	@Override
	public int compareTo(LineItem item){
		if(this.getId()==item.getId())
			return 0;
		else if(this.getId()<item.getId())
			return -1;
		else
			return 1;
	}



}
