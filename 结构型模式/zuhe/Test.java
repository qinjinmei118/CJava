package com.qjm.zuhe;

public class Test {
	public static void main(String args[]) {
		Employee ee=new Employee("John","CEO",30000);
		
		Employee head=new Employee("dan","head sale",16000);
		Employee market=new Employee("mark","market sale",12000);
		Employee clerk=new Employee("clerk"," Marketing",8000);
		Employee sale=new Employee("sale"," sale",6000);
		ee.add(head);
		ee.add(market);
		head.add(sale);
		market.add(clerk);
		System.out.println("ee="+ee);
		for(Employee em:ee.getList()) {
			System.out.println("em="+em);
			for(Employee yy:em.getList()) {
				System.out.println("yy="+yy);
			}
		}
	}
}
