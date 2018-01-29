package com.techlabs.pattern.creational.factory.method;

public class WebsiteFactory {
	
	public static Website makeWebsite(SiteType sitetype){
		if(sitetype.equals(SiteType.BLOGSITE)){
			return new BlogSite();
		}else{
			return new ShoppingSite();
		}
	}

}
