package com.qjm.mingling;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Order> list=new ArrayList<Order>();
	//�ռ����ִ������
	public void takeorder(Order order) {
		list.add(order);
	}
	public void placeOrder() {
		for(Order order:list) {
			order.excecute();
		}
		list.clear();
	}
}
