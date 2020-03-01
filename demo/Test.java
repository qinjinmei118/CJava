package com.qjm.demo;

public class Test {
	public static void main(String args[]) throws CloneNotSupportedException {
		MediaAdapter media=new MediaAdapter();
		ClonePlayer col1=media.play("mp4", "far away from home.mp4");
		col1.display();
		ClonePlayer col2=(ClonePlayer) col1.clone();
		col2.setAudioType("clv");
		col2.display();
	}
}
