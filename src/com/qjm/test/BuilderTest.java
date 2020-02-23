package com.qjm.test;

import com.qjm.builder.AbBuilder;
import com.qjm.builder.CarDetail;
import com.qjm.builder.Director;
import com.qjm.factory.BaoPaoFactory;
import com.qjm.factory.CarFactory;
import com.qjm.product.Car;


public class BuilderTest {
	public static void main(String args[]) {
		 CarFactory carFactory=new BaoPaoFactory();
		 Car product=carFactory.createCar();
		 AbBuilder builder=product.getTypeCar();
		 builder.buildPart1();
		 Director director=new Director(builder);
		 CarDetail cardetail=director.construct();
		 cardetail.show();
	}
}
