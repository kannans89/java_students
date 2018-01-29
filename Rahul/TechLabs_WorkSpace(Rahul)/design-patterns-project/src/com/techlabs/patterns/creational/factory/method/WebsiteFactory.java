package com.techlabs.patterns.creational.factory.method;

public class WebsiteFactory {
	
	public static Website makeWebsite(SiteType type){
		if(type.equals(SiteType.BLOG)){
			return new BlogSite();
		}
		else if(type.equals(SiteType.SHOPPING)){
			return new ShoppingSite();
		}
		else{
			return null;
		}
		
	}

}
