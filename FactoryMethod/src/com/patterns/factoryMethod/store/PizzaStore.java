package com.patterns.factoryMethod.store;

import com.patterns.factoryMethod.pizza.Pizza;
import com.patterns.factoryMethod.pizza.PizzaType;

public interface PizzaStore {

	Pizza orderPizza(PizzaType pizzaType);
}
