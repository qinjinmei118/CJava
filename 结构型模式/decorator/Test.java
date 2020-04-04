package com.qjm.decorator;

public class Test {
	public static  void main(String args[]) {
		Shape circle=new Circle();
		ShapeDecorator redCircle=new RedShapeDecorator(circle);
		redCircle.draw();
	}
}
