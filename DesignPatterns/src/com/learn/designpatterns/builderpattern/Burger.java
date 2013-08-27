package com.learn.designpatterns.builderpattern;

public abstract class Burger implements Item {
	
	@Override
	public Packing packing(){
		return new Wrapper();
	}
	
}
