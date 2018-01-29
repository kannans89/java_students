package com.techlabs.collections.old;

public class LineItem implements Comparable<LineItem> {
	
	private String name;
	private int id;
	private int quantity;
	private double unitprice;
	
	public LineItem(String name,int id,int quantity,double unitprice)
	{
		this.name=name;
		this.id=id;
		this.quantity=quantity;
		this.unitprice=unitprice;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double calculateTotalprice()
	{
		return quantity*unitprice;
	}

	//@Override
	/*public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}*/

	@Override
	public int hashCode()
	{
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineItem other = (LineItem) obj;
		if (id != other.id)
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "LineItem [name=" + name + ", id=" + id + ", quantity="
				+ quantity + ", unitprice=" + unitprice + "]";
	}

	@Override
	public int compareTo(LineItem item) {
		// TODO Auto-generated method stub
		if(this.id>item.id)
		{
			return 1;
		}
		else if(this.id<item.id)
		{
			return -1;
		}
		else return 0;
	}

	public double getUnitprice() {
		return unitprice;
	}
	
	public int getQuantity()
	{
		return quantity;
	}

	
}
