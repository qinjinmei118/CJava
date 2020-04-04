package com.qjm.Visitor;

public class Client {
	public static void main(String args[]) throws ReflectiveOperationException, IllegalAccessException {
		IProduct b1=new Book();
		IProduct b2=new Book();
		IProduct a1=new Apple();
		AVisitor visitor;
		
		BuyBasket basket=new BuyBasket();
		basket.addProduct(b1);
		basket.addProduct(b2);
		basket.addProduct(a1);
		//ʹ�÷��䣬��ȡ�õ�һ��������
		visitor=(AVisitor)XMLUtil.getBean();
		visitor.setName("����");
		basket.accept(visitor);
	}
}
