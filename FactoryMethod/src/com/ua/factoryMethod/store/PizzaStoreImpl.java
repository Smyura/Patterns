package com.ua.factoryMethod.store;

import com.ua.factoryMethod.pizza.Pizza;
import com.ua.factoryMethod.pizza.PizzaType;

public abstract class PizzaStoreImpl implements PizzaStore {

	@Override
	public Pizza orderPizza(PizzaType pizzaType) {
		Pizza pizza = createPizzaFactoryMethod(pizzaType);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	protected abstract Pizza createPizzaFactoryMethod(PizzaType pizzaType);
}
