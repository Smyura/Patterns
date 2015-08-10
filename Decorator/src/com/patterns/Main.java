package com.patterns;

import com.patterns.beverages.AbstractConcritBeverage;
import com.patterns.beverages.extentions.AbstractExtention;
import com.patterns.beverages.extentions.Milk;
import com.patterns.beverages.extentions.Sugar;
import com.patterns.beverages.impls.Espresso;

public class Main {

	public static void main(String[] args) {
		AbstractConcritBeverage espresso = new Espresso();
		espresso.setSize(3);

		AbstractExtention milk = new Milk();
		milk.setBeverage(espresso);

		AbstractExtention sugar = new Sugar();
		sugar.setBeverage(milk);

		System.out.println(sugar.getDescription());
		System.out.println(sugar.cost());
	}
}
