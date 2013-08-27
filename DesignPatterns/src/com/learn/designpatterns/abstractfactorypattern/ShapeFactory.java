package com.learn.designpatterns.abstractfactorypattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		if(shape == null) {
			return null;
		}
		
		if(shape.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		} else if(shape.equalsIgnoreCase("SQUARE")){
			return new Square();
		} else if(shape.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		
		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}

}
