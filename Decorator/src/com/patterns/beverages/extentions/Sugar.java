package com.patterns.beverages.extentions;

public class Sugar extends AbstractExtention {

	public Sugar() {
		this.description = "Sugar";
	}

	@Override
	public int cost() {
		return beverage.cost() + 2;
	}

}
