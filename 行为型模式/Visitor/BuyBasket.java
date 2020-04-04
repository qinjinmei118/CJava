package com.qjm.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

//ά��һ���б������ﳵ�Ŷ���
public class BuyBasket {
	private ArrayList list=new ArrayList();
	public void accept(AVisitor visitor) {
		Iterator i= list.iterator();
		while(i.hasNext()) {
			//����ʹ���˵�����
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
