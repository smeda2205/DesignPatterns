package com.learn.designpatterns.builderpattern;

public class VeggieBurger extends Burger {

	@Override
	public String name() {
		return "VeggieBurger";
	}

	@Override
	public float price() {
		return 5.0f;
	}

}
