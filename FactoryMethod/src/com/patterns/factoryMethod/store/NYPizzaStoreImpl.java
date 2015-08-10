package com.patterns.factoryMethod.store;

import com.patterns.factoryMethod.factory.NYPizzaIngredientFactoryImpl;
import com.patterns.factoryMethod.factory.PizzaIngredientsFactory;
import com.patterns.factoryMethod.pizza.CheesePizza;
import com.patterns.factoryMethod.pizza.NYGreekPizza;
import com.patterns.factoryMethod.pizza.NYPepperoniPizza;
import com.patterns.factoryMethod.pizza.NYVeggiPizza;
import com.patterns.factoryMethod.pizza.Pizza;
import com.patterns.factoryMethod.pizza.PizzaType;

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
