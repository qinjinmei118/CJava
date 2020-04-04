package com.qjm.mingling;

public class Buy implements Order {
	private Stock stock;
	@Override
	public void excecute() {
		// TODO 自动生成的方法存根
		stock.buy();
	}
	public Buy(Stock stock) {
		this.stock=stock;
	}
}
