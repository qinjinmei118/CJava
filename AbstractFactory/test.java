package com.qjm.AbstractFactory;

public class test {
	public static void main(String args[]) {
		FactoryProducer factory=new FactoryProducer();
		AbstractFactory shapeFactory=factory.getFactory("Shape");
		Shape shape1=shapeFactory.getShape("CIRCLE");
		shape1.draw();
		Shape shape2=shapeFactory.getShape("SQUARE");
		shape2.draw();
		AbstractFactory colorFactory=factory.getFactory("Color");
		Color color1=colorFactory.getColor("RED");
		color1.fill();
		Color color2=colorFactory.getColor("BLue");
		color2.fill();
	}
}
