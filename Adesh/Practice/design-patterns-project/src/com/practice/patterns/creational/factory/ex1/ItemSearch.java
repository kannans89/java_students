package com.practice.patterns.creational.factory.ex1;

 class ItemSearch extends Page{

	public ItemSearch(String desc) {
		super(desc);
	}

	@Override
	public void load() {
		System.out.println(getDescription()+" --> search here for any Item.");
	}

}
