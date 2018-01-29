package com.practice.chapter9.composite;

public class MenuTestDrive {

	public static void main(String[] args) {
		Menu allMenus = new Menu("ALL MENUS", "All menus combined");
		Menu panCakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		Menu dinnerMenu = new Menu("DINNER MENU", "Lunch");
		Menu cafeMenu = new Menu("CAFE MENU", "Dinner");
		Menu dessertMenu = new Menu("DESSERT MENU", "Dessert of course..!");
		
		MenuItem cake1 = new MenuItem("K&B's Pancake Breakfast", true, 2.99, "Pancake with scrambled eggs and toast");
		MenuItem cake2 = new MenuItem("Regular Pancake Breakfast", false, 2.99, "Pancakes with fried eggs, sausage");
		MenuItem cake3 = new MenuItem("Blueberry Pancakes", true, 3.89, "Pancakes made with fresh blueberries and strawberries");
		MenuItem cake4 = new MenuItem("Waffles", true, 3.50, "Waffles with your choice of blueberries and strawberries");
		
		MenuItem dinner1 = new MenuItem("Vegetarian BLT", true, 2.99, "(Fakin') Bacon with lettuce & tomato on whole wheat");
		MenuItem dinner2 = new MenuItem("BLT", false, 2.99, "Baccon with lettuce and tomato");
		MenuItem dinner3 = new MenuItem("Soup of the day", false, 3.29, "A bowl of the soup of the day, with a slide of potato salad");
		MenuItem dinner4 = new MenuItem("Hotdog", false, 3.05, "A hot dog, with saukraut, onions, topped with cheese");
		MenuItem dinner5 = new MenuItem("Pasta", true, 3.89, "Spaghetti with marinara sauce");
		
		MenuItem dessert1 = new MenuItem("Apple pie", true, 1.89, "Apple pie with leky crust, topped with vanilla icecream");
		MenuItem dessert2 = new MenuItem("Cheesecake", true, 1.99, "Creamy new york cheesecake, with chocolate");
		MenuItem dessert3 = new MenuItem("Sorbet", true, 1.89, "A scoop of raspberry and a scoop pf lime");
		
		MenuItem cafe1 = new MenuItem("Veggie Burger and air Fries", true, 3.99, "Veggie burger on whole wheat bun, lettuce and tomato");
		MenuItem cafe2 = new MenuItem("Soup of the day", false, 3.60, "A cup of the soup with a side salad");
		MenuItem cafe3 = new MenuItem("Burrito", true, 4.38, "A large buritto with whole pinto beans, salsa.");
		
		panCakeHouseMenu.addComponent(cake1);
		panCakeHouseMenu.addComponent(cake2);
		panCakeHouseMenu.addComponent(cake3);
		panCakeHouseMenu.addComponent(cake4);
		
		dinnerMenu.addComponent(dinner1);
		dinnerMenu.addComponent(dinner2);
		dinnerMenu.addComponent(dinner3);
		dinnerMenu.addComponent(dinner4);
		dinnerMenu.addComponent(dinner5);
		dinnerMenu.addComponent(dessertMenu);
		
		dessertMenu.addComponent(dessert1);
		dessertMenu.addComponent(dessert2);
		dessertMenu.addComponent(dessert3);
		
		cafeMenu.addComponent(cafe1);
		cafeMenu.addComponent(cafe2);
		cafeMenu.addComponent(cafe3);
		
		allMenus.addComponent(panCakeHouseMenu);
		allMenus.addComponent(dinnerMenu);
		allMenus.addComponent(cafeMenu);
		
		/*Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();*/
		               //OR
		allMenus.print();
	}

}
