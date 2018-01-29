package com.techlabs.pattern.creational.factory.method;

class ShoppingSite extends Website {

	@Override
	protected void createSitePage(){
		list.add(new CartPage("Cast Page"));
		list.add(new ProductSearchPage("ProductSearch Page"));
		list.add(new LineItemPage("lineItem Page"));
	}
	
}
