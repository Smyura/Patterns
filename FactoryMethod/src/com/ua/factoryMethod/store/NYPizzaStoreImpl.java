package com.ua.factoryMethod.store;

import com.ua.factoryMethod.factory.NYPizzaIngredientFactoryImpl;
import com.ua.factoryMethod.factory.PizzaIngredientsFactory;
import com.ua.factoryMethod.pizza.CheesePizza;
import com.ua.factoryMethod.pizza.NYGreekPizza;
import com.ua.factoryMethod.pizza.NYPepperoniPizza;
import com.ua.factoryMethod.pizza.NYVeggiPizza;
import com.ua.factoryMethod.pizza.Pizza;
import com.ua.factoryMethod.pizza.PizzaType;

public class NYPizzaStoreImpl extends PizzaStoreImpl {
	private PizzaIngredientsFactory pizzaIngredientsFactory;

	public NYPizzaStoreImpl() {
		pizzaIngredientsFactory = new NYPizzaIngredientFactoryImpl();
	}

	@Override
	protected Pizza createPizzaFactoryMethod(PizzaType pizzaType) {
		System.out.println("NY " + pizzaType);

		Pizza pizza = null;

		if (PizzaType.CHEESE.equals(pizzaType)) {
			pizza = new CheesePizza(pizzaIngredientsFactory);
		} else if (PizzaType.GREEK.equals(pizzaType)) {
			pizza = new NYGreekPizza();
		} else if (PizzaType.PEPPERONI.equals(pizzaType)) {
			pizza = new NYPepperoniPizza();
		} else if (PizzaType.VEGGI.equals(pizzaType)) {
			pizza = new NYVeggiPizza();
		}

		return pizza;
	}

}
