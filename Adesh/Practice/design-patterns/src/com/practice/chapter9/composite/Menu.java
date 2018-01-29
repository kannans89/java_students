package com.practice.chapter9.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{

	private String name;
	private String description;
	private List<MenuComponent> menuComponent;
	
	public Menu(String name, String desc){
		this.name = name;
		this.description = desc;
		menuComponent = new ArrayList<MenuComponent>();
	}
	
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public List<MenuComponent> getMenuComponent() {
		return menuComponent;
	}

	public void addComponent(MenuComponent component){
		menuComponent.add(component);
	}
	
	@Override
	public void print() {
		System.out.print("\n"+getName());
		System.out.println(", "+getDescription());
		System.out.println("------------------------------------------------");
		
		for(MenuComponent menu:menuComponent){
			menu.print();
		}
	}

}
