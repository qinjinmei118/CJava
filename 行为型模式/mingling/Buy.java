package com.qjm.mingling;

public class Buy implements Order {
	private Stock stock;
	@Override
	public void excecute() {
		// TODO �Զ����ɵķ������
		stock.buy();
	}
	public Buy(Stock stock) {
		this.stock=stock;
	}
}
