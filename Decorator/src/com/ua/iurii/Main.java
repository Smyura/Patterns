package com.ua.iurii;

import com.ua.iurii.beverages.AbstractConcritBeverage;
import com.ua.iurii.beverages.extentions.AbstractExtention;
import com.ua.iurii.beverages.extentions.Milk;
import com.ua.iurii.beverages.extentions.Sugar;
import com.ua.iurii.beverages.impls.Espresso;

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
