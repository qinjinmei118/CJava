package com.qjm.decorator.ClassDemo;

public class Fruit extends Decorating{

	public Fruit(IBirthdayCake birthdayCake) {
		super(birthdayCake);
		// TODO �Զ����ɵĹ��캯�����
	}
	public void putFruit() {
		System.out.println("Add Fruit");
	}
}
