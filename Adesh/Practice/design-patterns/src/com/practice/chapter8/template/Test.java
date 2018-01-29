package com.practice.chapter8.template;

public class Test {

	public static void main(String[] args) {
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
		
		System.out.println("Recipe for COFFEE==>");
		coffee.prepareRecipe();
		
		System.out.println("\nRecipe for TEA==>");
		tea.prepareRecipe();
	}

}
