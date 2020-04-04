package com.qjm.xiangyuan;

import com.qjm.AbstractFactory.Color;

public class Test {
	private static String color[]= {"red","blue","orange","gray","black","yellow"};
	public static void main(String args[]) {
		for(int i=0;i<10;i++) {
			Circle circle=(Circle) SHapeFactory.getCircleMap(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(10);
			circle.draw();
		}
		
	}
	private static String getRandomColor() {
		return color[(int)(Math.random()*color.length)];
	}
	private static int getRandomX() {
		return (int)(Math.random()*100);
	}
	private static int getRandomY() {
		return (int)(Math.random()*100);
	}
}
