package com.qjm.decorator.ClassDemo;

public class Cream extends Decorating{

	public Cream(IBirthdayCake birthdayCake) {
		super(birthdayCake);
		// TODO �Զ����ɵĹ��캯�����
	}
	public void putCream() {
		System.out.println("Add Cream");
	}

}
