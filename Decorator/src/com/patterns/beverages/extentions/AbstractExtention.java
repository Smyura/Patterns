package com.patterns.beverages.extentions;

import com.patterns.beverages.AbstractBeverage;

public abstract class AbstractExtention extends AbstractBeverage {
	protected AbstractBeverage beverage;

	@Override
	public String getDescription() {
		return beverage.getDescription() + " / " + description;
	}

	public void setBeverage(AbstractBeverage beverage) {
		this.beverage = beverage;
	}

}
