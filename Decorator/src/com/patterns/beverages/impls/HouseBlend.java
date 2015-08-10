package com.patterns.beverages.impls;

import com.patterns.beverages.AbstractConcritBeverage;

public class HouseBlend extends AbstractConcritBeverage {

	public HouseBlend() {
		this.description = "HouseBlend";
	}

	@Override
	public int cost() {
		return 4 * getSize();
	}

}
