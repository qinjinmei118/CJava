package com.qjm.mingling;

public class Sell implements Order {
	private Stock stock;
	public Sell(Stock stock) {
		this.stock=stock;
	}
	@Override
	public void excecute() {
		// TODO �Զ����ɵķ������
		stock.sell();
	}

}
