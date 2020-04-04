package com.qjm.builder;

public abstract class Drink implements Item {

	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		// TODO �Զ����ɵķ������
		return new Bottle();
	}

	@Override
	public abstract int price() ;

}
