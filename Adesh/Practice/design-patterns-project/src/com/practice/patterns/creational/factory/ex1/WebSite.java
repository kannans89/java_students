package com.practice.patterns.creational.factory.ex1;

import java.util.ArrayList;
import java.util.List;

public abstract class WebSite {
	protected List<Page> list;
	
	public WebSite(){
		list = new ArrayList<Page>();
		createSitePages();
	}

	protected abstract void createSitePages();

	public List<Page> getPages(){
		return list;
	}
}
