package com.qjm.waiguan;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	public ShapeMaker() {
		circle=new Circle();
		rectangle=new Rectangle();
	}
	public void drawCircle() {
		circle.draw();
	}
	public void drawRect() {
		rectangle.draw();
	}
}
