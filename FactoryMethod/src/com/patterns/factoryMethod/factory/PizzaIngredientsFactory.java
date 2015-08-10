package com.patterns.factoryMethod.factory;

import java.util.List;

import com.patterns.factoryMethod.pizza.ingredient.Calms;
import com.patterns.factoryMethod.pizza.ingredient.Dough;
import com.patterns.factoryMethod.pizza.ingredient.Pepperoni;
import com.patterns.factoryMethod.pizza.ingredient.Sauce;
import com.patterns.factoryMethod.pizza.ingredient.Veggi;

public interface PizzaIngredientsFactory {
	Dough createDough();

	Sauce createSauce();

	List<Veggi> createVeggies();

	Pepperoni createPepperoni();

	Calms createCalms();
}
