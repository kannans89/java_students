package com.techlabs.patterns.creational.factory.method;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	//ivars
	protected List<Page> pageList;
	
	//Constructor
	public Website(){
		pageList = new ArrayList<Page>();
		createSitePages();
	}
	//methods
	protected abstract void createSitePages();
	
	public List<Page> getPages(){
		return pageList;
	}
}
