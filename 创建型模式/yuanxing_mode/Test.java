package com.qjm.yuanxing_mode;

public class Test {
	public static void main(String args[]) {
		ShapeCach.loadShape();
		Shape shape=ShapeCach.getShape("1");
		System.out.println("Shape:"+shape.getType());
		Shape shape2=ShapeCach.getShape("2");
		System.out.println("Shape:"+shape2.getType());
	}
}
