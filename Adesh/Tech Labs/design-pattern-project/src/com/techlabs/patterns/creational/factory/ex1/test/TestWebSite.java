package com.techlabs.patterns.creational.factory.ex1.test;

import com.techlabs.patterns.creational.factory.ex1.Page;
import com.techlabs.patterns.creational.factory.ex1.SiteType;
import com.techlabs.patterns.creational.factory.ex1.WebSite;
import com.techlabs.patterns.creational.factory.ex1.WebSiteFactory;

public class TestWebSite {

	public static void main(String[] args) {
		WebSite mySite = WebSiteFactory.makeWebSite(SiteType.BLOG);
		System.out.println("===In the BLOGGING SITE===");
		print(mySite);
		
		WebSite shopSite = WebSiteFactory.makeWebSite(SiteType.SHOP);
		System.out.println("\n===In the SHOPPING SITE===");
		print(shopSite);
	}

	private static void print(WebSite site) {
		for(Page x:site.getPages()){
			x.load();
		}
	}

}
