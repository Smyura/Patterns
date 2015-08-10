package com.patterns.factoryMethod.factory;

import com.patterns.factoryMethod.pizza.Pizza;
import com.patterns.factoryMethod.pizza.PizzaType;

public interface PizzaFactory {
	Pizza createPizza(PizzaType pizzaType);
}
