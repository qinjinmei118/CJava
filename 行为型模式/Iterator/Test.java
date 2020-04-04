package com.qjm.Iterator;

public class Test {
	public static void main(String args[]) {
		NameRespository names=new NameRespository();
		/*Iterator ite=names.getIterator();
		ite.hasNext();*/
		for(Iterator ite=names.getIterator();
				ite.hasNext();) {
			String name=(String) ite.next();
			System.out.println("name:"+name);
		}
	}
}
