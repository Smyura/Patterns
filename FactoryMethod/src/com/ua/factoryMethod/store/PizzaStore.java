package com.ua.factoryMethod.store;

import com.ua.factoryMethod.pizza.Pizza;
import com.ua.factoryMethod.pizza.PizzaType;

public interface PizzaStore {

	Pizza orderPizza(PizzaType pizzaType);
}
