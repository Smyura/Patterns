package com.ua.factoryMethod;

import com.ua.factoryMethod.pizza.Pizza;
import com.ua.factoryMethod.pizza.PizzaType;
import com.ua.factoryMethod.store.NYPizzaStoreImpl;
import com.ua.factoryMethod.store.PizzaStoreImpl;

public class Main {

	public static void main(String[] args) {
		PizzaStoreImpl nyStore = new NYPizzaStoreImpl();

		Pizza pizza1 = nyStore.orderPizza(PizzaType.CHEESE);

		// System.out.println("------");
		// PizzaStoreImpl chicagoStore = new ChicagoPizzaStoreImpl();
		// Pizza pizza2 = chicagoStore.orderPizza(PizzaType.GREEK);
	}

}
