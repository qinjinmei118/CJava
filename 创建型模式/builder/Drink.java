package com.qjm.builder;

public abstract class Drink implements Item {

	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		// TODO 自动生成的方法存根
		return new Bottle();
	}

	@Override
	public abstract int price() ;

}
