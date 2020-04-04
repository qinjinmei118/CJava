package com.qjm.bridge;

public class Circle extends Shape{
	private int x,y,radius;
	protected Circle(DrawAPI drawApi,int x,int y,int radius) {
		super(drawApi);
		this.x=x;
		this.y=y;
		this.radius=radius;
	}

	public void draw() {
		drawApi.drawCircle(radius, x, y);
	}
}
