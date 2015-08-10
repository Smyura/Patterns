package com.patterns.beverages;

public abstract class AbstractBeverage implements BeverageInterface {
	protected String description;

	@Override
	public String getDescription() {
		return this.description;
	}

}
