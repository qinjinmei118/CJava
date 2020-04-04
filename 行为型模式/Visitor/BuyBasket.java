package com.qjm.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

//维护一个列表，往购物车放东西
public class BuyBasket {
	private ArrayList list=new ArrayList();
	public void accept(AVisitor visitor) {
		Iterator i= list.iterator();
		while(i.hasNext()) {
			//这里使用了迭代器
			((IProduct)i.next()).accept(visitor);
		}
	}
	public void addProduct(IProduct product) {
		list.add(product);
	}
	public void removeProduct(IProduct product) {
		list.remove(product);
	}
}
