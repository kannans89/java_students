package com.techlabs.patterns.creational.factory.ex1;

public class WebSiteFactory {
	private SiteType type;
	
	public static WebSite makeWebSite(SiteType type){
		if(type.equals(SiteType.BLOG)){
			return new BlogSite();
		}else if(type.equals(SiteType.SHOP)){
			return new ShoppingSite();
		}else return null;
	}

	public SiteType getType() {
		return type;
	}
}
