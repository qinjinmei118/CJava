package com.qjm.product;

import com.qjm.builder.AbBuilder;
import com.qjm.builder.JutiBuilder;

public class CarProduct_1 implements Car{

	@Override
	public  AbBuilder getTypeCar() {
		System.out.println("��Ʒ1��");
		return new JutiBuilder();
	}

}
