package com.qjm.proxy;

public class RealImage implements Image {
	private String  filename;
	@Override
	public void display() {
		// TODO �Զ����ɵķ������
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
