package com.patterns.strategy.behavior;

public class CanNotQuackBehaviorImpl implements QuackBehavior {

	@Override
	public void quack(String name) {
		System.out.println("I cann't quack : " + name);
	}

}
