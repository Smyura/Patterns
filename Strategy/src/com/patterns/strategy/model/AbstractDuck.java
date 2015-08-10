package com.patterns.strategy.model;

import com.patterns.strategy.behavior.FlyBehavior;
import com.patterns.strategy.behavior.QuackBehavior;

public abstract class AbstractDuck implements Duck {
	private String name;
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;

	public String getName() {
		return name;
	}

	@Override
	public void fly() {
		if (flyBehavior != null) {
			flyBehavior.fly(name);
		}
	}

	@Override
	public void quack() {
		if (quackBehavior != null) {
			quackBehavior.quack(name);
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
