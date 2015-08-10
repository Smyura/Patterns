package com.patterns.factoryMethod;

import com.patterns.factoryMethod.pizza.Pizza;
import com.patterns.factoryMethod.pizza.PizzaType;
import com.patterns.factoryMethod.store.NYPizzaStoreImpl;
import com.patterns.factoryMethod.store.PizzaStoreImpl;

public class Main {

	public static void main(String[] args) {
		PizzaStoreImpl nyStore = new NYPizzaStoreImpl();

		Pizza pizza1 = nyStore.orderPizza(PizzaType.CHEESE);

		// System.out.println("------");
		// PizzaStoreImpl chicagoStore = new ChicagoPizzaStoreImpl();
		// Pizza pizza2 = chicagoStore.orderPizza(PizzaType.GREEK);
	}

}
