package com.ua.iurii.beverages.impls;

import com.ua.iurii.beverages.AbstractConcritBeverage;

public class HouseBlend extends AbstractConcritBeverage {

	public HouseBlend() {
		this.description = "HouseBlend";
	}

	@Override
	public int cost() {
		return 4 * getSize();
	}

}
