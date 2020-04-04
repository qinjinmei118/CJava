package com.qjm.mingling;

public class Test {
	public static void main(String args[]) {
		Stock stock=new Stock();
		Buy buy=new Buy(stock);
		Sell sell=new Sell(stock);
		Broker broker=new Broker();
		broker.takeorder(buy);
		broker.takeorder(sell);
		broker.placeOrder();
	}
}
