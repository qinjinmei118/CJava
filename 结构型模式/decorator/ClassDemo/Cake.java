package com.qjm.decorator.ClassDemo;

public class Cake implements IBirthdayCake {
	
	public Cake() {
		System.out.println("Cake blank was Created");
	}

	@Override
	public void show() {
		// TODO �Զ����ɵķ������
		System.out.println("Cake Blank");
	}

}
