package com.patterns.beverages.impls;

import com.patterns.beverages.AbstractConcritBeverage;

public class Espresso extends AbstractConcritBeverage {

	public Espresso() {
		this.description = "Espresso";
	}

	@Override
	public int cost() {
		return 4 * getSize();
	}

}
