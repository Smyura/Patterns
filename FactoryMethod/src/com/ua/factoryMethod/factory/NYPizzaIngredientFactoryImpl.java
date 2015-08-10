package com.ua.factoryMethod.factory;

import java.util.ArrayList;
import java.util.List;

import com.ua.factoryMethod.pizza.ingredient.Calms;
import com.ua.factoryMethod.pizza.ingredient.Dough;
import com.ua.factoryMethod.pizza.ingredient.FreshCalms;
import com.ua.factoryMethod.pizza.ingredient.Marinara;
import com.ua.factoryMethod.pizza.ingredient.Onion;
import com.ua.factoryMethod.pizza.ingredient.Pepperoni;
import com.ua.factoryMethod.pizza.ingredient.RedPepper;
import com.ua.factoryMethod.pizza.ingredient.Sauce;
import com.ua.factoryMethod.pizza.ingredient.SlicedPepperoni;
import com.ua.factoryMethod.pizza.ingredient.ThinDough;
import com.ua.factoryMethod.pizza.ingredient.Veggi;

public class NYPizzaIngredientFactoryImpl implements PizzaIngredientsFactory {

	@Override
	public Dough createDough() {
		return new ThinDough();
	}

	@Override
	public Sauce createSauce() {
		return new Marinara();
	}

	@Override
	public List<Veggi> createVeggies() {
		List<Veggi> veggies = new ArrayList<Veggi>();
		veggies.add(new Onion());
		veggies.add(new RedPepper());
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Calms createCalms() {
		return new FreshCalms();
	}

}
