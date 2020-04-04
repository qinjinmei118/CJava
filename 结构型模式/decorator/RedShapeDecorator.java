package com.qjm.decorator;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape de) {
		super(de);
		// TODO 自动生成的构造函数存根
	}
	@Override
	public void draw() {
		decoratorShape.draw();
		setRedBorder(decoratorShape);
	}
	public void setRedBorder(Shape dd) {
		System.out.println("border color is red");
	}

}
