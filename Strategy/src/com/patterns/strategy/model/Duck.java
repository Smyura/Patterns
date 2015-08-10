package com.patterns.strategy.model;

import com.patterns.strategy.behavior.FlyBehavior;
import com.patterns.strategy.behavior.QuackBehavior;

public interface Duck {
	void quack();

	void fly();

	void setName(String name);

	void setFlyBehavior(FlyBehavior flyBehavior);

	void setQuackBehavior(QuackBehavior quackBehavior);

}
