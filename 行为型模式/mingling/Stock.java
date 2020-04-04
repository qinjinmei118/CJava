package com.qjm.mingling;

public class Stock {
	private String name="ABC";
	private int quantity=10;
	public void buy() {
		System.out.println("Stock[Name:"+name+",quantity:"+quantity+"buy");
	}
	public void sell() {
		System.out.println("Stock[Name:"+name+",quantity:"+quantity+"sell");
	}
}
