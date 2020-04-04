package com.qjm.decorator.ClassDemo;

public class Client {
	public static void main(String args[]) {
		IBirthdayCake birthday=new Cake();
		birthday.show();
		Cream cream=new Cream(birthday);
		cream.putCream();
		Fruit fruit=new Fruit(birthday);
		fruit.putFruit();
		fruit.show();
	}

}
