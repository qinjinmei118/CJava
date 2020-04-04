package com.qjm.proxy;

public class RealImage implements Image {
	private String  filename;
	@Override
	public void display() {
		// TODO 自动生成的方法存根
		System.out.println("displaying:"+filename);
	}
	public RealImage(String filename) {
		this.filename=filename;
		loadFromDisk(filename);
	}
	private void loadFromDisk(String filename) {
		System.out.println("Loading:"+filename);
	}
}
