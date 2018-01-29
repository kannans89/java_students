package com.techlabs.patterns.creational.factory.method.test;

import com.techlabs.patterns.creational.factory.method.Page;
import com.techlabs.patterns.creational.factory.method.SiteType;
import com.techlabs.patterns.creational.factory.method.Website;
import com.techlabs.patterns.creational.factory.method.WebsiteFactory;

public class Test {

	public static void main(String[] args) {
		Website site1 =WebsiteFactory.makeWebsite(SiteType.BLOG);
		for(Page currentPage : site1.getPages()){
			currentPage.load();
		}
		
		Website site2 = WebsiteFactory.makeWebsite(SiteType.SHOPPING);
		for(Page currentPage : site2.getPages()){
			currentPage.load();
		}
	}

}
