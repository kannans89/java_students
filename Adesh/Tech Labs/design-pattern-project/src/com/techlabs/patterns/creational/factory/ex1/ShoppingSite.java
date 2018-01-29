package com.techlabs.patterns.creational.factory.ex1;

class ShoppingSite extends WebSite{

	@Override
	protected void createSitePages() {
		list.add(new CartPage("Cart Page"));
		list.add(new ItemSearch("Item Search"));
		list.add(new LineItem("Line Item"));
	}

}
