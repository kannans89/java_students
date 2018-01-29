package com.techlabs.composition;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Order {
	private final int id;
	private Date date;
	List<LineItem> items;

	public Order(int id, Date date, List<LineItem> items) {
		this.id = id;
		this.date = date;
		this.items = items;
	}

	public double checkOutPrice() {
		double price = 0;
		Iterator<LineItem> i = items.iterator();
		while (i.hasNext()) {
			price = price + i.next().calcTotalPrice();

		}
		return price;

	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + " Check Out price "
				+ checkOutPrice() + "]";
	}

}
