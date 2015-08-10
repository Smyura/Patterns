package com.patterns.factoryMethod.pizza;

import com.patterns.factoryMethod.factory.PizzaIngredientsFactory;

public class CheesePizza extends Pizza {
	private PizzaIngredientsFactory pizzaIngredientsFactory;

	public CheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
		this.pizzaIngredientsFactory = pizzaIngredientsFactory;
	}

	@Override
	public void prepare() {
		System.out.println("prepare pizza");
		System.out.println("  Name:" + name);
		this.dough = pizzaIngredientsFactory.createDough();
		System.out.println("  Tossing dough: " + dough);
		this.sauce = pizzaIngredientsFactory.createSauce();
		System.out.println("  Adding sauce: " + sauce);
		this.calms = pizzaIngredientsFactory.createCalms();
		System.out.println("  Adding calms: " + calms);
		veggies = pizzaIngredientsFactory.createVeggies();
		System.out.print("  Adding veggies: " + veggies);
		// for (Veggi top : toppings) {
		// System.out.print(" " + top);
		// }
		// System.out.println();
	}
}
