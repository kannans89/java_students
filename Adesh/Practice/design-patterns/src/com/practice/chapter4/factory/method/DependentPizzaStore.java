package com.practice.chapter4.factory.method;


public class DependentPizzaStore {
	
	Pizza pizza = null;
	public Pizza createPizza(String style, String type){
		if(style.equals("NY")){
			if(type.equals("cheese")){
				pizza = new NYStyleCheesePizza();
			}else if(type.equals("veggie")){
				pizza = new NYStyleVeggiePizza();
			}else if(type.equals("clam")){
				pizza = new NYStyleClamPizza();
			}
			
		}else if(style.equals("Chicago")){
			if(type.equals("cheese")){
				pizza = new ChicagoStyleCheesePizza();
			}else if(type.equals("veggie")){
				pizza = new ChicagoStyleVeggiePizza();
			}else if(type.equals("clam")){
				pizza = new ChicagoStyleClamPizza();
			}
		}else{
			System.out.println("Error: invalid type of pizza..");
			return null;
		}
		
	pizza.prepare();
	pizza.bake();
	pizza.cut();
	pizza.box();
	return pizza;
	}
	
}
