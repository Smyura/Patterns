package com.patterns.factoryMethod.pizza;

import com.patterns.factoryMethod.factory.PizzaIngredientsFactory;

public class NYCheesePizza extends CheesePizza {
	public NYCheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
		super(pizzaIngredientsFactory);
	}
}
