package com.qjm.yuanxing_mode;

import java.util.Hashtable;

public class ShapeCach {
	//��ȡʵ����
	private static Hashtable<String,Shape> shapeMap=new Hashtable<String,Shape>();
	public static Shape getShape(String shapeId) {
		Shape shapeCache=shapeMap.get(shapeId);
		return (Shape) shapeCache.clone();
	}
	//������״
	public static void loadShape() {
		Circle circle=new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		Square square=new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
	}
}
