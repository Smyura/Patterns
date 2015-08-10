package com.ua.iurii.beverages;

public abstract class AbstractBeverage implements BeverageInterface {
	protected String description;

	@Override
	public String getDescription() {
		return this.description;
	}

}
