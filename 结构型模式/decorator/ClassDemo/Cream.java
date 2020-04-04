package com.qjm.decorator.ClassDemo;

public class Cream extends Decorating{

	public Cream(IBirthdayCake birthdayCake) {
		super(birthdayCake);
		// TODO 自动生成的构造函数存根
	}
	public void putCream() {
		System.out.println("Add Cream");
	}

}
