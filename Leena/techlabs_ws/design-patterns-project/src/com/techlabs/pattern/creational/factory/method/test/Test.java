package com.techlabs.pattern.creational.factory.method.test;

import com.techlabs.pattern.creational.factory.method.Page;
import com.techlabs.pattern.creational.factory.method.SiteType;
import com.techlabs.pattern.creational.factory.method.Website;
import com.techlabs.pattern.creational.factory.method.WebsiteFactory;

public class Test {

	public static void main(String[] args) {
		
		Website mySite=WebsiteFactory.makeWebsite(SiteType.BLOGSITE);
		print(mySite);
		
		System.out.println("----------------------------------------------");
		
		Website mySite1=WebsiteFactory.makeWebsite(SiteType.SHOPPINGSITE);
		print(mySite1);
	}
	
	public static void print(Website site){
		for(Page page:site.getpages()){
			page.load();
		}
	}

}
