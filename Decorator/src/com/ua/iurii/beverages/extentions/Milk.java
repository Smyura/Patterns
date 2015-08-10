package com.ua.iurii.beverages.extentions;

public class Milk extends AbstractExtention {

	public Milk() {
		this.description = "Milk";
	}

	@Override
	public int cost() {
		return beverage.cost() + 1;
	}

}
