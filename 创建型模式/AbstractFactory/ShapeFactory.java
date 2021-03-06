package com.qjm.AbstractFactory;

public class ShapeFactory extends AbstractFactory{
	public Color getColor(String color) {
		return null;
	}
	public Shape getShape(String shape) {
		if(shape==null) {
			return null;
		}else if(shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if(shape.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}
}
