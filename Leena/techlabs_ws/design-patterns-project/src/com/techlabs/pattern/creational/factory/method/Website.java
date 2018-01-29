package com.techlabs.pattern.creational.factory.method;
import java.util.ArrayList;
import java.util.List;

public abstract class Website {
	
	protected List<Page> list;
	
	public Website(){
		list=new ArrayList<Page>();
		createSitePage();
	}

	protected abstract void createSitePage();
	
	public List<Page> getpages(){
		return list;
	}

}
