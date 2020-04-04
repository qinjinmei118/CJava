package com.qjm.gongchang_mode;

public class ShapeFactory {
/*	private String type;
	public ShapeFactory(String type) {
		this.type=type;
	}*/
	public Shape getShape(String type) {
		if(type==null) {
			return null;
		}else if(type.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(type.equalsIgnoreCase("RECTANGLE")){
			return new Rectancle();
		}
		return null;
	}
}
