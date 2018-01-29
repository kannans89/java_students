package com.practice.patterns.creational.factory.ex1;

 class ShoppingSite extends WebSite{

	@Override
	protected void createSitePages() {
		list.add(new CartPage("CART PAGE"));
		list.add(new ItemSearch("ITEM SEARCH"));
		list.add(new LineItem("LINE ITEM"));
	}

}
