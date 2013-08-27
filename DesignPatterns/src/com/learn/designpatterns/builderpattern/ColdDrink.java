package com.learn.designpatterns.builderpattern;

public abstract class ColdDrink implements Item {
	
	@Override
	public Packing packing(){
		return new Bottle();
	}
	
}
