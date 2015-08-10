package com.patterns.strategy.behavior;

public class CanFlyBehaviorImpl implements FlyBehavior {

	@Override
	public void fly(String name) {
		System.out.println("I can fly: " + name);
	}

}
