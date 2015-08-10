package com.patterns.strategy;

import com.patterns.strategy.behavior.CanFlyBehaviorImpl;
import com.patterns.strategy.behavior.CanNotFlyBehaviorImpl;
import com.patterns.strategy.behavior.CanNotQuackBehaviorImpl;
import com.patterns.strategy.behavior.CanQuackBehaviorImpl;
import com.patterns.strategy.model.Duck;
import com.patterns.strategy.model.RubberDuck;
import com.patterns.strategy.model.WildDuck;

public class Main {

	public static void main(String[] args) {

		Duck wildDuck = buildWildDuck();
		wildDuck.fly();
		wildDuck.quack();

		Duck rubberDuck = buildRubberDuck();
		rubberDuck.fly();
		rubberDuck.quack();
	}

	private static Duck buildWildDuck() {
		Duck wildDuck = new WildDuck();
		wildDuck.setName("wild");
		wildDuck.setFlyBehavior(new CanFlyBehaviorImpl());
		wildDuck.setQuackBehavior(new CanQuackBehaviorImpl());
		return wildDuck;
	}

	private static Duck buildRubberDuck() {
		Duck rubberDuck = new RubberDuck();
		rubberDuck.setName("rubber");
		rubberDuck.setFlyBehavior(new CanNotFlyBehaviorImpl());
		rubberDuck.setQuackBehavior(new CanNotQuackBehaviorImpl());
		return rubberDuck;
	}

}
