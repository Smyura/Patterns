package com.ua.factoryMethod.factory;

import java.util.List;

import com.ua.factoryMethod.pizza.ingredient.Calms;
import com.ua.factoryMethod.pizza.ingredient.Dough;
import com.ua.factoryMethod.pizza.ingredient.Pepperoni;
import com.ua.factoryMethod.pizza.ingredient.Sauce;
import com.ua.factoryMethod.pizza.ingredient.Veggi;

public interface PizzaIngredientsFactory {
	Dough createDough();

	Sauce createSauce();

	List<Veggi> createVeggies();

	Pepperoni createPepperoni();

	Calms createCalms();
}
