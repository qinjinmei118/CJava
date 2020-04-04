package com.qjm.decorator;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape de) {
		super(de);
		// TODO �Զ����ɵĹ��캯�����
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
