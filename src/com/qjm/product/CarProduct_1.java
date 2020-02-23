package com.qjm.product;

import com.qjm.builder.AbBuilder;
import com.qjm.builder.JutiBuilder;

public class CarProduct_1 implements Car{

	@Override
	public  AbBuilder getTypeCar() {
		System.out.println("²úÆ·1£º");
		return new JutiBuilder();
	}

}
