package com.qjm.decorator.ClassDemo;

public class Fruit extends Decorating{

	public Fruit(IBirthdayCake birthdayCake) {
		super(birthdayCake);
		// TODO 自动生成的构造函数存根
	}
	public void putFruit() {
		System.out.println("Add Fruit");
	}
}
