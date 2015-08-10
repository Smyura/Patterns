package com.patterns.factoryMethod.factory;

import java.util.ArrayList;
import java.util.List;

import com.patterns.factoryMethod.pizza.ingredient.Calms;
import com.patterns.factoryMethod.pizza.ingredient.Dough;
import com.patterns.factoryMethod.pizza.ingredient.FreshCalms;
import com.patterns.factoryMethod.pizza.ingredient.Marinara;
import com.patterns.factoryMethod.pizza.ingredient.Onion;
import com.patterns.factoryMethod.pizza.ingredient.Pepperoni;
import com.patterns.factoryMethod.pizza.ingredient.RedPepper;
import com.patterns.factoryMethod.pizza.ingredient.Sauce;
import com.patterns.factoryMethod.pizza.ingredient.SlicedPepperoni;
import com.patterns.factoryMethod.pizza.ingredient.ThinDough;
import com.patterns.factoryMethod.pizza.ingredient.Veggi;

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
