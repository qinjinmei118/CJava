package com.qjm.builder;

public class CarDetail {
	private int wheels;
	private String brand;
	public int getWheels() {
		return wheels;
	}
	public String getBrand() {
		return brand;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void show() {
		System.out.println("产品的轮子数："+getWheels()+"产品的品牌："+getBrand());
	}
}
