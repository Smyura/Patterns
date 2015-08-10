package com.patterns.strategy.behavior;

public class CanQuackBehaviorImpl implements QuackBehavior {

	@Override
	public void quack(String name) {
		System.out.println("I can quack : " + name);
	}

}
