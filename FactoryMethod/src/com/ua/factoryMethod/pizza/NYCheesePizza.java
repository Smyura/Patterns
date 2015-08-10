package com.ua.factoryMethod.pizza;

import com.ua.factoryMethod.factory.PizzaIngredientsFactory;

public class NYCheesePizza extends CheesePizza {
	public NYCheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
		super(pizzaIngredientsFactory);
	}
}
