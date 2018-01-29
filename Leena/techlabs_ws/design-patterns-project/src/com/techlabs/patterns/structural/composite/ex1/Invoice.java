package com.techlabs.patterns.structural.composite.ex1;
import java.util.ArrayList;
import java.util.List;

public class Invoice implements IOrderComponents{
	
	private String name;
	private String description;
	private List<IOrderComponents> itmes;
	
	public Invoice(String name,String description){
		this.name=name;
		this.description=description;
		this.itmes=new ArrayList<IOrderComponents>();
		
	}
	
	public void addItems(IOrderComponents item){
		itmes.add(item);
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	@Override
	public void printOrderDetails(){
		System.out.println(getName()+" Printing...");
		System.out.println("--------------------------------------------------------");
		for(IOrderComponents item:itmes){
			item.printOrderDetails();
		}
	
	}

}
