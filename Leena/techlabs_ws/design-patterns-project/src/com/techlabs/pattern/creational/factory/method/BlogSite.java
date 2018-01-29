package com.techlabs.pattern.creational.factory.method;

class BlogSite extends Website{

	@Override
	protected void createSitePage(){
		list.add(new HomePage("HomePage"));
		list.add(new AboutUsPage("About Us"));
		list.add(new PostPage("Post Page"));
	}
	
}
