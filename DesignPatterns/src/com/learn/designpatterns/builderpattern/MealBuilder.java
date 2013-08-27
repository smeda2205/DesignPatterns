package com.learn.designpatterns.builderpattern;

public class MealBuilder {
	
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		
		meal.addItem(new VeggieBurger());
		meal.addItem(new Coke());
		
		return meal;
	}
	
	public Meal prepareNonVegMeal(){
		Meal meal = new Meal();
		
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		
		return meal;
	}
}
