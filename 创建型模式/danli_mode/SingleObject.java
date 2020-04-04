package com.qjm.danli_mode;

public class SingleObject {
	private static SingleObject instance=new SingleObject();
	private SingleObject() {
		
	}
	public static SingleObject getInstance() {
		return instance;
	}
	public void show() {
		System.out.println("µ¥ÀýÄ£Ê½");
	}
}
