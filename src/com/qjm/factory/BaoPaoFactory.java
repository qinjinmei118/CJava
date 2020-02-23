package com.qjm.factory;

import com.qjm.product.Car;
import com.qjm.product.CarProduct_1;

public class BaoPaoFactory implements CarFactory{

	@Override
	public Car createCar() {
		return new CarProduct_1();
	}

}
