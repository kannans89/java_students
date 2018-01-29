package com.techlabs.patterns.creational.factory.method;

class ShoppingSite extends Website {
	@Override
	protected void createSitePages() {
		pageList.add(new CartPage("This is Home Page Description"));
		pageList.add(new ItemSelectPage("About us page Description"));
		pageList.add(new LineItemPage("Post Page Description"));
	}
}
