package com.patterns.factoryMethod.pizza;

import java.util.List;

import com.patterns.factoryMethod.pizza.ingredient.Calms;
import com.patterns.factoryMethod.pizza.ingredient.Dough;
import com.patterns.factoryMethod.pizza.ingredient.Sauce;
import com.patterns.factoryMethod.pizza.ingredient.Veggi;

public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected List<Veggi> veggies;
	protected Calms calms;

	public String getName() {
		return name;
	}

	abstract public void prepare();

	public void bake() {
		System.out.println("bake pizza");
	}

	public void cut() {
		System.out.println("cut pizza");
	}

	public void box() {
		System.out.println("box pizza");
	}

}
