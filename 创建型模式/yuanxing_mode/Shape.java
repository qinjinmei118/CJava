package com.qjm.yuanxing_mode;

public abstract class Shape implements Cloneable{
	private String id;
	public String type;
	public String getType() {
		return type;
	}
	public abstract void draw();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Object clone() {
		Object clone=null;
		try {
			clone=super.clone();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return clone;
	}
}
