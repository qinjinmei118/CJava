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
		//使用反射，获取得到一个访问者
		visitor=(AVisitor)XMLUtil.getBean();
		visitor.setName("张三");
		basket.accept(visitor);
	}
}
