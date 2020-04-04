package com.qjm.xiangyuan;

import java.util.HashMap;

public class SHapeFactory {
	private final static HashMap<String,Shape> circleMap=new HashMap<String,Shape>();
	public static Shape getCircleMap(String color) {
		Circle circle=(Circle) circleMap.get(color);
		if(circle==null) {
			circle=new Circle(color);
			circleMap.put(color, circle);
			System.out.println("creating circle of color:"+color);
		}
		return circle;
	}
}
