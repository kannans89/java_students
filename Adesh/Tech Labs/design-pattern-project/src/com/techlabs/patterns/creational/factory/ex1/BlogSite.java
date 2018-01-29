package com.techlabs.patterns.creational.factory.ex1;

class BlogSite extends WebSite{

	@Override
	protected void createSitePages() {
		list.add(new HomePage("Home Page"));
		list.add(new AboutPage("About Page"));
		list.add(new PostPage("Post Page"));
	}

}
