package com.qjm.decorator;

public abstract class ShapeDecorator implements Shape {
	protected Shape decoratorShape;
	public ShapeDecorator(Shape de) {
		this.decoratorShape=de;
	}
	@Override
	public void draw() {
		// TODO �Զ����ɵķ������
		decoratorShape.draw();
	}

}
