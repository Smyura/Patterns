package com.ua.iurii.beverages.impls;

import com.ua.iurii.beverages.AbstractConcritBeverage;

public class Espresso extends AbstractConcritBeverage {

	public Espresso() {
		this.description = "Espresso";
	}

	@Override
	public int cost() {
		return 4 * getSize();
	}

}
