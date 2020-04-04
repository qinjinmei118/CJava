package com.qjm.AbstractFactory;

public class ColorFactory extends AbstractFactory{
	public Color getColor(String color) {
		if(color==null) {
			return null;
		}else if(color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}else if(color.equalsIgnoreCase("RED")) {
			return new Red();
		}
		return null;
	}
	public Shape getShape(String shape) {
		return null;
	}
}
