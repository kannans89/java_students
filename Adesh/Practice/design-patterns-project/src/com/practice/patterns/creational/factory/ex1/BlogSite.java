package com.practice.patterns.creational.factory.ex1;

 class BlogSite extends WebSite{

	@Override
	protected void createSitePages() {
		list.add(new HomePage("HOME PAGE"));
		list.add(new AboutPage("ABOUT PAGE"));
		list.add(new PostPage("POST PAGE"));
	}

}
