package com.ua.factoryMethod.factory;

import com.ua.factoryMethod.pizza.Pizza;
import com.ua.factoryMethod.pizza.PizzaType;

public interface PizzaFactory {
	Pizza createPizza(PizzaType pizzaType);
}
