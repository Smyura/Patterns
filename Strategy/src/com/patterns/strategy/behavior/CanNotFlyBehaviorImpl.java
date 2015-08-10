package com.patterns.strategy.behavior;

public class CanNotFlyBehaviorImpl implements FlyBehavior {

	@Override
	public void fly(String name) {
		System.out.println("I cann't fly: " + name);
	}

}
