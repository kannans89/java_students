package com.techlabs.patterns.creational.factory.method;

public class BlogSite extends Website {

	@Override
	protected void createSitePages() {
		pageList.add(new HomePage("This is Home Page Description"));
		pageList.add(new AboutUsPage("About us page Description"));
		pageList.add(new PostPage("Post Page Description"));
		
	}

}
