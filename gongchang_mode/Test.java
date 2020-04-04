package com.qjm.gongchang_mode;

public class Test {
	public static void main(String args[]) {
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape shape1=shapeFactory.getShape("circle");
		Shape shape2=shapeFactory.getShape("Rectangle");
		shape1.draw();
		shape2.draw();
	}
}
