package com.learn.designpatterns.builderpattern;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "ChickenBurger";
	}

	@Override
	public float price() {
		return 10.0f;
	}

}
